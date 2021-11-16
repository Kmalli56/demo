package com.hcl.pp.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pp.exception.PetPeersException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
import com.hcl.pp.repository.UserRepository;
import com.hcl.pp.validator.LoginValidator;
import com.hcl.pp.validator.UserValidator;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PetService petService;

	@Override
	@Transactional
	public List<Pet> loginUser(LoginValidator loginRequest) throws PetPeersException {
		User userExists = userRepository.findByUserNameAndUserPassword(loginRequest.getUserName(),
				loginRequest.getPassword());
		List<Pet> pets = null;
		if (userExists != null) {
			pets = petService.getAllPets();
			if (pets != null && pets.size() > 0) {
				return pets;
			} else {
				throw new PetPeersException("No Pets are available to purchase");
			}
		} else {
			throw new PetPeersException("User not exists, please register.");
		}

	}

	@Override
	@Transactional
	public User addUser(UserValidator newUser) throws PetPeersException {
		if (!(newUser.getPassword().equals(newUser.getConfirmPassword()))) {
			System.out.println("entered");
			throw new PetPeersException("Mismatch in password");

		} else {
			User isUserExist = userRepository.findByUserName(newUser.getUserName());
			if (isUserExist != null) {
				throw new PetPeersException(", try with another credentials.");
			} else {
				User user = new User();
				user.setUserName(newUser.getUserName());
				user.setUserPassword(newUser.getPassword());
				user.setConfirmPassword(newUser.getConfirmPassword());
				User addUser = userRepository.save(user);
				return addUser;
			}
		}

	}

	@Override
	@Transactional
	public User getMyPets(Long userId) throws PetPeersException {
		User pets = null;
		if (userId != null) {
			Optional<User> optionalUser = userRepository.findById(userId);
			if (optionalUser.isPresent()) {
				pets = optionalUser.get();
			} else {
				throw new PetPeersException("No pets are available for this user id");
			}
		} else {
			throw new PetPeersException("User id is invalid");
		}

		return pets;
	}

	@Override
	@Transactional
	public List<User> listUsers() throws PetPeersException {
		return userRepository.findAll();
	}

	@Override
	@Transactional
	public Optional<User> getUserById(Long id) throws PetPeersException {
		return userRepository.findById(id);
	}

	@Override
	@Transactional
	public String removeUser(Long id) throws PetPeersException {
		Optional<User> userFind = userRepository.findById(id);
		String info = null;
		if (userFind != null) {
			userRepository.deleteById(id);
			info = "User is deleted successfully...";
		} else {
			info = "User is not found";
		}
		return info;
	}

	@Override
	@Transactional
	public User findByUserName(String name) throws PetPeersException {
		return userRepository.findByUserName(name);
	}

	@Override
	@Transactional
	public User updateUser(User updateUser) throws PetPeersException {
		Optional<User> userFind = userRepository.findById((Long) updateUser.getId());
		User userUpdate = null;
		if (userFind != null) {
			User user = new User();
			user.setUserName(updateUser.getUserName());
			user.setUserPassword(updateUser.getUserPassword());
			user.setConfirmPassword(updateUser.getConfirmPassword());
			Set<Pet> listPet = new HashSet<>();
			for (Pet pet : updateUser.getPets()) {
				Pet pets = new Pet();
				pets.setName(pet.getName());
				pets.setAge(pet.getAge());
				pets.setPlace(pet.getPlace());
				pets.setOwner(user);
				listPet.add(pets);
			}
			user.setPets(listPet);

			userUpdate = userRepository.save(user);
		} else {
			userUpdate = null;
		}
		return userUpdate;
	}

}

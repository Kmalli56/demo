package com.hcl.pp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pp.exception.PetPeersException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
import com.hcl.pp.repository.PetRepository;


@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetRepository petRepository;

	@Override
	@Transactional
	public Pet savePet(Pet pet) throws PetPeersException {
		Pet petSaved = null;
		petSaved = petRepository.save(pet);
		if (petSaved != null) {
			return petSaved;
		} else {
			throw new PetPeersException("Pet is not saved");
		}
	}

	@Override
	public List<Pet> getAllPets() throws PetPeersException {
		List<Pet> pets = petRepository.findAll();
		if (pets != null && pets.size() > 0) {
			return pets;
		} else {
			throw new PetPeersException("No pets are available");
		}
	}

	@Override
	@Transactional
	public Optional<Pet> getPetById(Long petId) throws PetPeersException {
		Optional<Pet> pet = petRepository.findById(petId);
		if (pet.isPresent()) {
			return pet;
		} else {
			throw new PetPeersException("No pet exists with this id");

		}
	}

	@Override
	@Transactional
	public Pet buyPet(Long petId, Long userId) {
		Optional<Pet> petsById = petRepository.findById(petId);
		Pet petsDetails = petsById.get();
		petsById.get().setOwner(new User(userId));
		Pet pets = petRepository.save(petsDetails);
		return pets;
	}

}

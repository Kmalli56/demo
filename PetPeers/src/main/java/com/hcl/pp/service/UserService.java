package com.hcl.pp.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.hcl.pp.exception.PetPeersException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
import com.hcl.pp.validator.LoginValidator;
import com.hcl.pp.validator.UserValidator;


public interface UserService {

	public abstract User addUser(@Valid UserValidator newUser) throws PetPeersException;

	public abstract List<Pet> loginUser(@Valid LoginValidator loginUser) throws PetPeersException;

	public abstract User getMyPets(Long userId) throws PetPeersException;

	public abstract User updateUser(User user) throws PetPeersException;

	public abstract List<User> listUsers() throws PetPeersException;

	public abstract Optional<User> getUserById(Long id) throws PetPeersException;

	public abstract String removeUser(Long id) throws PetPeersException;

	public abstract User findByUserName(String name) throws PetPeersException;

}

package com.hcl.pp.service;

import java.util.List;
import java.util.Optional;

import com.hcl.pp.exception.PetPeersException;
import com.hcl.pp.model.Pet;


public interface PetService {

	public abstract Pet savePet(Pet pet) throws PetPeersException;

	public abstract List<Pet> getAllPets() throws PetPeersException;

	public abstract Pet buyPet(Long petId, Long userId) throws PetPeersException;

	public Optional<Pet> getPetById(Long petId) throws PetPeersException;

}

package com.hcl.pp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;


@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

	List<Pet> findByOwner(User owner);

	Optional<Pet> findById(Long id);
}

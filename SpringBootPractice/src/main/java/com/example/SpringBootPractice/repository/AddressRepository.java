package com.example.SpringBootPractice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootPractice.model.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}

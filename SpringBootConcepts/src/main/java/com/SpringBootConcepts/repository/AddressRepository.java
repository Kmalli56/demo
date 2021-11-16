package com.SpringBootConcepts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SpringBootConcepts.model.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
	@Query("SELECT adrs.state FROM Address as adrs where adrs.doorNo = :id")
	public abstract String anyName(@Param("id") Integer id);

	@Query(value = "select * from address", nativeQuery = true)
	public abstract List<Address> nativeQueryMethod();
}

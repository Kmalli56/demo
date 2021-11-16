package com.SpringBootConcepts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootConcepts.model.Address;
import com.SpringBootConcepts.service.AddressService;


@RestController
@RequestMapping("controller")
public class AddressController {

	@Autowired
	private AddressService addressService; // interface

	@GetMapping("/")
	public String sayHello() {
		return "Welcome to Spring Boot, Keep learning....";
	}

	@PostMapping("/create")
	public ResponseEntity<Address> createRecord(@RequestBody Address address) {
		Address addressCreated = null;
		if (address != null) {
			addressCreated = addressService.createAddress(address);
		}
		return new ResponseEntity<Address>(addressCreated, HttpStatus.CREATED);
	}

	@GetMapping("/read/{doorNo}")
	public Address readRecord(@PathVariable int doorNo) {
		Address readAddress = null;
		if (doorNo > 0) {
			readAddress = addressService.readAddressByDoorNo(doorNo);
		}
		return readAddress;
	}

	@GetMapping("/readall")
	public Address readRecords() {
		return addressService.readAddresses();
	}

	@PutMapping("/update")
	public Address updateAddress(@RequestBody Address address) {
		return addressService.updateAddressByDoorNo(address);
	}

	@DeleteMapping("/delete/{doorNo}")
	public int deleteRecord(@PathVariable int doorNo) {
		return addressService.deleteAddressByDoorNo(doorNo);
	}

	@GetMapping("customQuery/{doorNo}")
	public ResponseEntity<String> customQuery(@PathVariable int doorNo) {
		String str = addressService.getStateById(doorNo);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	@GetMapping("nativeQuery")
	public ResponseEntity<List<Address>> nativeQuery() {
		return new ResponseEntity<List<Address>>(addressService.nativeQuery(), HttpStatus.OK);
	}

}

package com.example.SpringBootPractice.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootPractice.model.Address;
import com.example.SpringBootPractice.repository.AddressRepository;


@Service
public class AddressIMP implements AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	@Transactional
	public Address createAddress(Address address) {
		addressRepository.save(address);
		return address;
	}

	@Override
	@Transactional
	public Address readAddressByDoorNo(int doorNo) {
		Address address = null;
		Optional<Address> optionalAddress = addressRepository.findById(doorNo);
		if (optionalAddress.isPresent()) {
			address = optionalAddress.get();
		}
		return address;
	}

	@Override
	@Transactional
	public Address updateAddressByDoorNo(Address address) {

		return addressRepository.save(address);
	}

	@Override
	@Transactional
	public int deleteAddressByDoorNo(int doorNo) {
		addressRepository.deleteById(doorNo);
		return doorNo;
	}

	@Override
	@Transactional
	public Address readAddresses() {
		return new Address(321, "readAll", "readAll");
	}

}

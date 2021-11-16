package com.SpringBootConcepts.service;

import java.util.List;

import com.SpringBootConcepts.model.Address;


public interface AddressService {
	public abstract Address createAddress(Address address);

	public abstract Address readAddressByDoorNo(int doorNo);

	public abstract Address readAddresses();

	public abstract Address updateAddressByDoorNo(Address address);

	public abstract int deleteAddressByDoorNo(int doorNo);
	
	public abstract String getStateById(int doorNo);
	
	public abstract List<Address> nativeQuery();
}

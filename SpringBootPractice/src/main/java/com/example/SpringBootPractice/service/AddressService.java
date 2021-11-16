package com.example.SpringBootPractice.service;

import com.example.SpringBootPractice.model.Address;


public interface AddressService {
	public abstract Address createAddress(Address address);

	public abstract Address readAddressByDoorNo(int doorNo);

	public abstract Address readAddresses();

	public abstract Address updateAddressByDoorNo(Address address);

	public abstract int deleteAddressByDoorNo(int doorNo);
}

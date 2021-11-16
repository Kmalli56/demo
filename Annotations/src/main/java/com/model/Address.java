package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 
 * @author mounika.kuna
 *
 */
@Component
public class Address {
	@Value (value="090909")
	private int houseNo;
	@Value (value="East Street")
	private String streetName;
	
	public Address() {
		super();
	}
	
	public Address(int houseNo, String streetName) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
	}

	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
}

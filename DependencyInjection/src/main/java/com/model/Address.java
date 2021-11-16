package com.model;
/**
 * 
 * @author mounika.kuna
 *
 */
public class Address {
	private int doorNo;
	private String State;
	
	public Address(int doorNo, String state) {
		super();
		this.doorNo = doorNo;
		this.State = state;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	
	public Address() {
		super();
		//System.out.println("Address Constructor");
	}
}

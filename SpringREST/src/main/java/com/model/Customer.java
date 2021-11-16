package com.model;


public class Customer {
	private String customerName;
	private String customerPh_Number;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPh_Number() {
		return customerPh_Number;
	}

	public void setCustomerPh_Number(String customerPh_Number) {
		this.customerPh_Number = customerPh_Number;
	}

	public Customer(String customerName, String customerPh_Number) {
		super();
		this.customerName = customerName;
		this.customerPh_Number = customerPh_Number;
	}

	public Customer() {
		super();
	}
}

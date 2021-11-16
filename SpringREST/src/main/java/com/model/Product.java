package com.model;


public class Product {
	private int productID;
	private String productName;
	private Customer customer;

	public Product(int productID, String productName, Customer customer) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product(int productID, String productName) {
		super();
		this.productID = productID;
		this.productName = productName;
	}

	public Product() {
		super();
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}

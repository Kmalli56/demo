package com.main5;

/**
 * 
 * @author mounika.kuna
 *
 */
public class ShoppingCart {

	private int productId;
	private String productName;

	public ShoppingCart() {
		super();
	}

	public ShoppingCart(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}

package com.exception;
/**
 * 
 * @author mounika.kuna
 *
 */
public class EmployeeException extends Exception{
	private String message;

	public EmployeeException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
}

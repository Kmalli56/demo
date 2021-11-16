package com.hcl.pp.validator;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author mounika.kuna
 *
 */
public class LoginValidator implements Serializable {

	private static final long serialVersionUID = 1873043213616930636L;

	@NotNull(message = "userName can't be null")
	@NotEmpty(message = "userName can't be empty")
	private String userName;

	@NotNull(message = "password can't be null")
	@NotEmpty(message = "password can't be empty")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

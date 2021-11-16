package com.hcl.pp.validator;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author mounika.kuna
 *
 */
public class UserValidator implements Serializable {

	private static final long serialVersionUID = 6663190996567312288L;

	@NotNull(message = "Username can't be null")
	@NotEmpty(message = "Username can't be empty")
	private String userName;

	@NotNull(message = "Password can't be null")
	@NotEmpty(message = "Password can't be empty")
	private String password;

	@NotNull(message = "Confirm Password can't be null")
	@NotEmpty(message = "Confirm Password can't be empty")
	private String confirmPassword;

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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}

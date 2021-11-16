package com.service;
/**
 * 
 * @author mounika.kuna
 *
 */
public class UserService implements UserDataService{
	public String displayWelcomePage(String usrNam, int userId ) {
		return "Welcome to HCL - "+usrNam+" "+"("+userId+")";
	}
}

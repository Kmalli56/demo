package com.main;

import java.util.Scanner;
import com.service.UserService;
/**
 * 
 * @author mounika.kuna
 *
 */
public class LoginPage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter UserName : ");
		String userName = scanner.next();
		System.out.println("Enter SAP ID : ");
		int userId = scanner.nextInt();
		
		UserService userService = new UserService();
		String welcomeEmployee = userService.displayWelcomePage(userName, userId);
		System.out.println(welcomeEmployee);
	}

}

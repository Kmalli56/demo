package com.main;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.IEmployeeDao;
import com.service.EmployeeService;
import com.service.IEmployeeService;


public class DeleteMain {

	public static void main(String[] args) {
		IEmployeeService iEmployeeService = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id of an employee to delete : ");
		int id = scanner.nextInt();
		int deletedCount = iEmployeeService.deleteEmployee(id);
		if (deletedCount == 1) {
			System.out.println("Deleted successfully");
		} else {
			System.err.println("Something went wrong - can't delete");
		}
	}

}

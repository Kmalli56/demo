package com.main;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.IEmployeeDao;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.IEmployeeService;


public class ReadMain {

	public static void main(String[] args) {
		IEmployeeService iEmployeeService = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id of an employee to get employee details : ");
		int id = scanner.nextInt();
		Employee employee = iEmployeeService.readEmployeebyId(id);
		System.out.println("Employee Id - " + employee.getEmployeeId() + " details are");
		System.out.println("Employee Name :" + employee.getEmployeeName());
		System.out.println("Employee salary :" + employee.getSalary() + "\n");
	}
}

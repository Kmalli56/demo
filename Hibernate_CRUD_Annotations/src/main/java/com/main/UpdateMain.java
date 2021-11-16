package com.main;

import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.IEmployeeDao;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.IEmployeeService;


public class UpdateMain {

	public static void main(String[] args) {
		IEmployeeService iEmployeeService = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of an employee : ");
		String name = scanner.next();
		System.out.println("Enter the salary of an employee : ");
		float salary = scanner.nextFloat();
		System.out.println("Enter the id of an employee :");
		int id = scanner.nextInt();
		Employee employee3 = iEmployeeService.updateEmployee(new Employee(id, name, salary));
		System.out.println("Employee Id - " + employee3.getEmployeeId() + " details are");
		System.out.println("Employee Name :" + employee3.getEmployeeName());
		System.out.println("Employee salary :" + employee3.getSalary() + "\n");
	}

}

package com.main;

import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDao;
import com.dao.IEmployeeDao;
import com.model.Employee;
import com.service.EmployeeService;
import com.service.IEmployeeService;


public class CreateMain {

	public static void main(String[] args) {
		IEmployeeService iEmployeeService = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of an employee : ");
		String name = scanner.next();
		System.out.println("Enter the salary of an employee : ");
		float salary = scanner.nextFloat();
		System.out.println("Enter the id of an employee :");
		int id = scanner.nextInt();
		Employee employee1 = new Employee(id, name, salary);
		iEmployeeService.createEmployee(employee1);
		List<Employee> list = iEmployeeService.readAll();
		System.out.println("\nTotal employees details are : ");
		for (Employee employee : list) {
			System.out.println("Employee Id :" + employee.getEmployeeId());
			System.out.println("Employee Name :" + employee.getEmployeeName());
			System.out.println("Employee salary :" + employee.getSalary() + "\n");
		}
	}

}

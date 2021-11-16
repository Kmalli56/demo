package com.main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.exception.EmployeeException;
import com.model.Employee;
import com.service.EmployeeInterface;
import com.service.EmployeeService;
/**
 * 
 * @author mounika.kuna
 *
 */
public class MainApplication {

	public static void main(String[] args) {
		try {
			Employee employee1 = new Employee(1, "Mounika", 13.0f);
			Employee employee2 = new Employee(2, "Rekha", 12.0f);
			Employee employee3 = new Employee(3, "sharma", 11.0f);

			Set<Employee> employees = new HashSet();
			employees.add(employee1);
			employees.add(employee2);
			employees.add(employee3);

			EmployeeInterface employeeInterface = new EmployeeService();

			Scanner scanner =  new Scanner(System.in);

			System.out.println("Search employee by user id : ");
			int id = scanner.nextInt();
			Employee employeeI =  employeeInterface.searchEmployeebyUserId(employees,id);
			if(employeeI != null) {
				System.out.println("ID     : "+employeeI.getEmployeeId()+"\nName   : "+employeeI.getEmployeeName()+"\nSalary : "+employeeI.getSalary());
			}else { System.out.println("Not found employee id"); } 
			
			System.out.println("\nSearch employee by user name : ");
			String empName = scanner.next();
			Employee employeeN =  employeeInterface.searchEmployeebyUserName(employees, empName);
			if(employeeN != null) {
				System.out.println("ID     : "+employeeN.getEmployeeId()+"\nName   : "+employeeN.getEmployeeName()+"\nSalary : "+employeeN.getSalary());
			}else { System.out.println("Not found employee name"); }
			
		} catch (EmployeeException e) {
			System.out.println("Not found"+e.getMessage());
		}
	}
}

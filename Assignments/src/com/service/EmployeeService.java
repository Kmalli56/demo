package com.service;

import com.model.Employee;
/**
 * 
 * @author mounika.kuna
 *
 */

public class EmployeeService {
	
	//Assignment - 1
	public Employee displayMaximumSalary(Employee employee1, Employee employee2) {
		if(employee1.getSalary()>employee2.getSalary()) {
			return employee1;
		}else {
			return employee2;
		}
	}
	
	//Assignment - 2
	public float displaySumArray(float[] salaryArray) {
		if(salaryArray.length > 0) {
			float sum=0.0f;
			for(int index=0; index < salaryArray.length; index++) 
				sum += salaryArray[index];
			return sum;			
		}
		return 0.0f;
	}
	
	//Assignment - 3
	public float displayBudget(Employee[] employeeArray) {
		if(employeeArray.length > 0) {
			return employeeArray[0].getSalary()+employeeArray[1].getSalary();
		}
		return 0.0f;
	}
	
	//Assignment - 4
	public Employee searchEmployee(Employee[] employeesArray, String employeeName) {
		Employee employeeDetails=null;
		if(employeesArray.length > 0) {
			for(int index=0; index<employeesArray.length; index++) {				
				if(employeeName.equals(employeesArray[index].getEmpName())) {
					employeeDetails = employeesArray[index];
				}
			}			
		}
		return employeeDetails;			
	}	
}

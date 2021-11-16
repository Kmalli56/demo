package com.service;

import java.util.Iterator;
import java.util.Set;

import com.exception.EmployeeException;
import com.model.Employee;
/**
 * 
 * @author mounika.kuna
 *
 */
public class EmployeeService implements EmployeeInterface{

	@Override
	public Employee searchEmployeebyUserId(Set<Employee> set, int employeeId) throws EmployeeException {
		Employee returnEmployee = null;
		for (Employee employee : set) {
			if(employee.getEmployeeId() == employeeId) {
				returnEmployee = employee;
			}
		}
		return returnEmployee;
	}

	@Override
	public Employee searchEmployeebyUserName(Set<Employee> set, String employeeName) throws EmployeeException {
		Employee returnEmployee = null;
		for (Employee employee : set) {
			if(employee.getEmployeeName().equalsIgnoreCase(employeeName)) {
				returnEmployee = employee;
			}
		}
		return returnEmployee;
	}

}

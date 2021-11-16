package com.service;

import java.util.Set;

import com.exception.EmployeeException;
import com.model.Employee;
/**
 * 
 * @author mounika.kuna
 *
 */
public interface EmployeeInterface {
	public abstract Employee searchEmployeebyUserId(Set<Employee> set, int employeeId) throws EmployeeException;
	public abstract Employee searchEmployeebyUserName(Set<Employee> set, String employeeName) throws EmployeeException;
}

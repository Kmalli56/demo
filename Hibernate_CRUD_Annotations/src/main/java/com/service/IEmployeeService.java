package com.service;

import java.util.List;

import com.model.Employee;


public interface IEmployeeService {
	public abstract Employee createEmployee(Employee e);

	public abstract List<Employee> readAll();

	public abstract Employee readEmployeebyId(int e);

	public abstract Employee updateEmployee(Employee e);

	public abstract int deleteEmployee(int employeeId);
}

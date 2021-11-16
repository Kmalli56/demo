package com.dao;

import java.util.List;

import com.model.Employee;


public interface IEmployeeDao {
	public abstract Employee createEmployee(Employee e);

	public abstract List<Employee> readAll();

	public abstract Employee readEmployeebyId(int e);

	public abstract Employee updateEmployee(Employee e);

	public abstract int deleteEmployee(int employeeId);
}

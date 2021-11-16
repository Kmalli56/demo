package com.service;

import java.util.List;

import javax.transaction.Transactional;

import com.dao.EmployeeDao;
import com.dao.IEmployeeDao;
import com.model.Employee;


public class EmployeeService implements IEmployeeService {

	@Override
	public Employee createEmployee(Employee e) {
		Employee employee = null;
		if (e != null) {
			IEmployeeDao iEmployeeDao = new EmployeeDao();
			employee = iEmployeeDao.createEmployee(e);
		} else {
			System.out.println("Provide proper inputs :");
		}
		return employee;
	}

	@Override
	public List<Employee> readAll() {
		IEmployeeDao iEmployeeDao = new EmployeeDao();
		List<Employee> employeeLst = iEmployeeDao.readAll();
		return employeeLst;
	}

	@Override
	public Employee readEmployeebyId(int id) {
		Employee employee = null;
		if (id > 0) {
			IEmployeeDao iEmployeeDao = new EmployeeDao();
			employee = iEmployeeDao.readEmployeebyId(id);
		} else {
			System.out.println("Provide proper id :");
		}
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee e) {
		Employee employee = null;
		if (e != null) {
			IEmployeeDao iEmployeeDao = new EmployeeDao();
			employee = iEmployeeDao.updateEmployee(e);

		} else {
			System.out.println("Provide proper inputs :");
		}
		return employee;
	}

	@Override
	public int deleteEmployee(int employeeId) {
		int count = 0;
		if (employeeId >= 0) {
			IEmployeeDao iEmployeeDao = new EmployeeDao();
			count = iEmployeeDao.deleteEmployee(employeeId);
		} else {
			System.out.println("Provide proper inputs :");
		}
		return count;
	}

}

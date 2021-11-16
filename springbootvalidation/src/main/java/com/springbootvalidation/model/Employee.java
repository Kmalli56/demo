package com.springbootvalidation.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Employee {
	private int employeeNo;
	@NotEmpty(message = "Please enter employee name")
	@Size(min = 3, max = 6, message = "Min 3 char and max 6 char")
	private String employeeName;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Past
	private LocalDate dob;
	private double salary;
	@Email
	private String email;

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee(int employeeNo,
			@NotEmpty(message = "Please enter employee name") @Size(min = 3, max = 6, message = "Min 3 char and max 6 char") String employeeName,
			LocalDate dob, double salary, String email) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.dob = dob;
		this.salary = salary;
		this.email = email;
	}

	public Employee() {
		super();
	}
}

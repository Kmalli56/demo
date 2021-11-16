package com.main4;

/**
 * 
 * @author mounika.kuna
 *
 */
public class Employee {
	private int employeeNumber;
	private String employeeName;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(int employeeNumber, String employeeName, float salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}

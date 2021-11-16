package com.model;
/**
 * 
 * @author mounika.kuna
 *
 */
public class Employee {

	private String employeeName;
	private float salary;

	public Employee(String employeeName, float salary) {
		this.employeeName=employeeName;
		this.salary=salary;
	}

	public String getEmpName() {
		return employeeName;
	}

	public void setEmpName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}

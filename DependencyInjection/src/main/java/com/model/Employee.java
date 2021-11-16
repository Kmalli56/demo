package com.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/**
 * 
 * @author mounika.kuna
 *
 */
public class Employee {
	private int empNo;
	private String empName;
	private float salary;
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	public void startHere() {
		System.out.println("LifeCycle - Init method started here");
	}
	
	public void endHere() {
		System.out.println("\nLifeCycle - Init method ended here");
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int empNo, String empName, float salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee() {
		super();
		//System.out.println("Employee Constructor");
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

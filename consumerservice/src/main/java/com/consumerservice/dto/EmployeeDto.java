package com.consumerservice.dto;

/**
 * 
 * @author mounika.kuna
 *
 */
public class EmployeeDto {
	private int employeeNo;
	private String employeeName;
	private float salary;
	private int deptId;

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public EmployeeDto(int employeeNo, String employeeName, float salary, int deptId) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.salary = salary;
		this.deptId = deptId;
	}

	public EmployeeDto() {
		super();
	}
}

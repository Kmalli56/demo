package com.consumerfeign.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author mounika.kuna
 *
 */
public class Department implements Serializable {

	private static final long serialVersionUID = 7915565223283479534L;

	private int deptNo;
	private String deptName;
	private List<EmployeeDto> empDto;

	public Department() {
		super();
	}

	public Department(int deptNo, String deptName, List<EmployeeDto> empDto) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.empDto = empDto;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<EmployeeDto> getEmpDto() {
		return empDto;
	}

	public void setEmpDto(List<EmployeeDto> empDto) {
		this.empDto = empDto;
	}

}

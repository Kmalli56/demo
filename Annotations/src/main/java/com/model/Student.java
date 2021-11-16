package com.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * 
 * @author mounika.kuna
 *
 */

//@Service 
//@Repository
@Component (value="alias")
@PropertySource ("classpath:com/config/read.properties")
public class Student {
	//@Value (value="777")
	private int studentNo;
	//@Value (value="Mounika Kuna")
	private String studentName;
	//@Value (value="99")
	private int score;
	@Autowired
	private Address address;
	
	@Autowired
	//public Student(@Value (value="777") int studentNo, @Value (value="Mounika Kuna") String studentName, @Value (value="99") int score) {
	public Student(@Value (value="${studentNo}") int studentNo, @Value (value="${studentName}") String studentName, @Value (value="${score}") int score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.score = score;
	}
	@PostConstruct
	public void init() {
		System.out.println("Bean Life Cycle - init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean Life Cycle - destroy method");
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

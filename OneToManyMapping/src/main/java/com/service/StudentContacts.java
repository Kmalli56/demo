package com.service;


import com.dao.StudentContactDetails;
import com.model.Student;


public class StudentContacts implements com.service.StudentContactDetails {

	@Override
	public Student createEmployee(Student student) {
		if(student!=null) {
			StudentContactDetails studentContactDetails = new com.dao.StudentContacts();
			Student studentContacts = studentContactDetails.createEmployee(student);
		}else {
			System.out.println("Provide valid inputs");
		}
		return student;
	}
	
}

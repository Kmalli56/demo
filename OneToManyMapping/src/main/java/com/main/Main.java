package com.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.service.StudentContactDetails;
import com.model.Phone;
import com.model.Student;
import com.util.HibernateUtil;


public class Main {

	public static void main(String[] args) {

		Set<Phone> phoneNumbers = new HashSet<Phone>();
		phoneNumbers.add(new Phone("Home", "0987654321"));
		phoneNumbers.add(new Phone("Personal", "0923382943"));

		Student student = new Student("Java", phoneNumbers);
		StudentContactDetails studentContactDetails = new com.service.StudentContacts();
		Student studentContacts = studentContactDetails.createEmployee(student);
		System.out.println("\nStudents details are : ");
		System.out.println("Student Id	:" + studentContacts.getStudentId());
		System.out.println("Student Name	:" + studentContacts.getStudentName());

		System.out.println("\n" + studentContacts.getStudentName() + ", " + "Contact Details are ");
		Set<Phone> contactDetails = studentContacts.getStudentPhoneNumbers();
		for (Phone phone : contactDetails) {
			System.out.println("\nPhone Id	:" + phone.getPhoneId());
			System.out.println("Phone Number	:" + phone.getPhoneNumber());
			System.out.println("Phone Type	:" + phone.getPhoneType());
		}
	}
}
package com.main;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Student;

public class Main {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		Student student1 = new Student(20, "Mallikarjun k m", 39);
		Student student2 = new Student(45, "Ramu", 87);
		
		org.hibernate.Transaction transaction = session.beginTransaction();
		session.save(student1);
		session.save(student2);
		transaction.commit();
		
		//To get record based an StudentNumber
		Student student = session.get(Student.class, 2);
		System.out.println("Roll No		:"+student.getStudentNo());
		System.out.println("Name		:"+student.getStudentName());
		System.out.println("Marks		:"+student.getMarks()+"\n");
		
		String selectQuery = "FROM Student";
		Query<Student> stList= session.createQuery(selectQuery);
		List<Student> list = stList.list();
		System.out.println("Total Records in student_table are");
		for (Student students : list) {
			System.out.println("Roll No		:"+students.getStudentNo());
			System.out.println("Name		:"+students.getStudentName());
			System.out.println("Marks		:"+students.getMarks()+"\n");
		}
		
		System.out.println("Session ended");
		
	}

}

package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.Student;

/**
 * 
 * @author mounika.kuna
 *
 */
public class Main2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
		Student student = applicationContext.getBean(Student.class);
		System.out.println("NAME	:"+student.getStudentName());
		System.out.println("NUMBER	:"+student.getStudentNo());
		System.out.println("SCORE	:"+student.getScore());
	}
}

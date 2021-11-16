package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

/**
 * 
 * @author mounika.kuna
 *
 */
public class Main3 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/config.xml");
		Student student = (Student) applicationContext.getBean("alias");
		System.out.println("Displays output using XML : ");
		System.out.println("NAME		:"+student.getStudentName());
		System.out.println("NUMBER		:"+student.getStudentNo());
		System.out.println("SCORE		:"+student.getScore());
		System.out.println("HOUSE NUMBER	:"+student.getAddress().getHouseNo());
		System.out.println("STREET		:"+student.getAddress().getStreetName());
	}

}

package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;
/**
 * 
 * @author mounika.kuna
 *
 */
public class ConstructorArgsMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/constructorArgs.xml");
		Employee employee = (Employee)applicationContext.getBean("employeeId");	
		System.out.println("From <constructor-arg> using index ");
		System.out.println("Employee ID   :"+employee.getEmpNo()+"\n"+"Employee Name :"+employee.getEmpName()+"\n"+"Salary        :"+employee.getSalary());
	}
}

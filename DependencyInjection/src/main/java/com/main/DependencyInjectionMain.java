package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;
/**
 * 
 * @author mounika.kuna
 *
 */
public class DependencyInjectionMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/config/constructorArgs.xml");
		Employee employee = (Employee)applicationContext.getBean("employeeId");	
		System.out.println("\nDependency Injection output using Employee and Adreess class");
		System.out.println("Employee ID   :"+employee.getEmpNo()+"\n"+"Employee Name :"+employee.getEmpName()+"\n"+"Salary        :"+employee.getSalary());
		System.out.println("Door No       :"+employee.getAddress().getDoorNo()+"\n"+"State         :"+employee.getAddress().getState());
		((ConfigurableApplicationContext) applicationContext).registerShutdownHook();
	}
}

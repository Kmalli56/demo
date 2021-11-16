package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.Address;
import com.model.Student;

/**
 * 
 * @author mounika.kuna
 *
 */
@Configuration
@ComponentScan(basePackages = "com")
public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Address.class);
		Address address = (Address) applicationContext.getBean("address");
		System.out.println("HOUSE NUMBER	:"+address.getHouseNo());
		System.out.println("STREET		:"+address.getStreetName());
	}

}

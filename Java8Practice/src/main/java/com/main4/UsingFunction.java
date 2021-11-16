package com.main4;

import java.util.function.Function;

/**
 * 
 * @author mounika.kuna
 *
 */
public class UsingFunction {

	public static void main(String[] args) {
		Function<Employee, String> emFunction = (string) -> {
			return string.getEmployeeName() + ", learning java 8 features";
		};
		String name = emFunction.apply(new Employee(123, "Mounika", 9999.9f));
		System.out.println(name);
	}

}

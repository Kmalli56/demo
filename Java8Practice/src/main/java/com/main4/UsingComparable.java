package com.main4;

/**
 * 
 * @author mounika.kuna
 *
 */
public class UsingComparable {

	public static void main(String[] args) {
		Comparable<Employee> comparable = (what) -> {
			System.out.println("Comparable interface");
			return (int) what.getSalary() + 500;
		};
		int output = comparable.compareTo(new Employee(10, "Mounika", 10000.0f));
		System.out.println(output);
	}

}

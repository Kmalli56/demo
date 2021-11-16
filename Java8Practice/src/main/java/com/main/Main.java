package com.main;
/**
 * 
 * @author mounika.kuna
 *
 */
public class Main {

	public static void main(String[] args) {
		InterfaceFile interfaceFile = new ImplementationFile();
		System.out.println("Sum of 23 and 3 is " + interfaceFile.getSum(23, 3));

		new SampleInterface() {

			@Override
			public void display() {

			}
		};
	}

}

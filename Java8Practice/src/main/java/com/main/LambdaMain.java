package com.main;

/**
 * 
 * @author mounika.kuna
 *
 */
public class LambdaMain {

	public static void main(String[] args) {
		FunctionalInterface functionalInterface1 = () -> System.out.println("Lambda Expressions");
		LambdaMain.methodOne(functionalInterface1);
	}

	private static void methodOne(FunctionalInterface functionalInterface) {
		System.out.println("One of the Java 8 feature is");
		functionalInterface.display();
	}

}

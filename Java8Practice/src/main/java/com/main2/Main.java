package com.main2;

/**
 * 
 * @author mounika.kuna
 *
 */
public class Main {

	public static void main(String[] args) {
		UsingStaticInterface usingStaticInterface = (m, n) -> {
			return m + n;
		};
		System.out.println("Without Method Interface : " + usingStaticInterface.add(23, 3));

		// using method reference
		UsingStaticInterface usingStaticInterface2 = StaticClass::add;
		int sum = usingStaticInterface.add(2, 3);
		System.out.println("Sum using method reference is : " + sum);
	}

}

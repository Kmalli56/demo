package com.main3;

/**
 * 
 * @author mounika.kuna
 *
 */
public class UsingReferenceMethod {

	public static void main(String[] args) {
		UsingFunctionalInterface usingFunctionalInterface = () -> {
			System.out.println("Not a Method reference");
		};
		usingFunctionalInterface.display();
		UsingReferenceMethod usingReferenceMethod = new UsingReferenceMethod();

		UsingFunctionalInterface interface1 = usingReferenceMethod::methodReference;
		interface1.display();

	}

	private void methodReference() {
		System.out.println("Methodreference - Inside");
	}

}

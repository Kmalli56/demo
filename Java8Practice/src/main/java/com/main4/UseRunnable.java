package com.main4;

/**
 * 
 * @author mounika.kuna
 *
 */
public class UseRunnable {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Runnable interface");
		};
		runnable.run();
	}

}

package com.main4;

import java.util.function.BiConsumer;

/**
 * 
 * @author mounika.kuna
 *
 */
public class UsingBiConsumer {

	public static void main(String[] args) {
		BiConsumer<Integer, String> biConsumer = (id, name) -> {
			System.out.println("ID :" + (id + 20));
			System.out.println("Name :" + name);
		};
		biConsumer.accept(100000, "HCL");
	}

}

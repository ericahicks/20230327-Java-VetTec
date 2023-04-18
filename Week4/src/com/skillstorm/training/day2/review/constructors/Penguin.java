package com.skillstorm.training.day2.review.constructors;

public class Penguin extends Bird {
	
	static String home = "Antartica";
	static {
		home = home.toUpperCase();
		for (char c : home.toCharArray()) {
			System.out.println(c);
		}
	}
	
	public Penguin() {
		System.out.println("Penguin Constructor has run");
	}

}
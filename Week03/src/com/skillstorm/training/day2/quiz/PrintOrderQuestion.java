package com.skillstorm.training.day2.quiz;

public class PrintOrderQuestion {
	// What is the order that each 
	// statement is printed to the console?
	// 
	// Hello
	// World!
	// World!
	// Goodbye.

	public static void sayWorld() {
		System.out.println("World!");
	}

	public static void sayHello() {
		System.out.println("Hello");
		sayWorld();
	}

	public static void main(String[] args) {
		sayHello();
		sayWorld();
		System.out.println("Goodbye.");
	}

}

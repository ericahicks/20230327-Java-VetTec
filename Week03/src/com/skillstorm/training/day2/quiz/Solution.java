package com.skillstorm.training.day2.quiz;

public class Solution {
	// What is the output of the following Java code?
	// Doe John
	static void printName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	public static void main(String[] args) {
		String firstName = "John";
		String lastName = "Doe";
		printName(lastName, firstName); // order of arguments matters not the name
	}
}

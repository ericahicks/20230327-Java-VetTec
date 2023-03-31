package com.skillstorm.training.day5;

public class EvenNumberChecker {
	
	public static void main(String[] args) {
		int number = (int) (Math.random() * 100) + 1;
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		System.out.println("Number was " + number);
	}

}

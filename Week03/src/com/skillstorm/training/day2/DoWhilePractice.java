package com.skillstorm.training.day2;

import java.util.Scanner;

public class DoWhilePractice {
	// TODO drop a screenshot in the chat of the below code's output
	public static void main(String[] args) {
		int count = 3;
		do {
			count = count - 1; 
			System.out.println(count); // 2, 1, 0
		} while(count > 0);
		////////////////////////////////
		// Iterate through an array
		int[] numbers = { };
		int i = 0;
		while (i < numbers.length) {
			System.out.println(numbers[i]);
			i++;
		}
//		do {
//			System.out.println(numbers[i]);
//			i++;
//		} while(i < numbers.length);
		//////////////////////////////////////////
		// Prompt a user for their age
		Scanner in = new Scanner(System.in);
//		System.out.println("Enter your age: ");
//		byte age = in.nextByte();
//		while (age < 0) {
//			System.out.println("Please enter a valid age: ");
//			age = in.nextByte();
//		}
//		System.out.println("Thanks, age entered was " + age);
		
		// Prompt user with do-while loop
		byte age2;
		do {
			System.out.println("Enter a valid age: ");
			age2 = in.nextByte();
		} while (age2 < 0);
		System.out.println("Thanks, age entered was " + age2);
		in.close();
	}

}

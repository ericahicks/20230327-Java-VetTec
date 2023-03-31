package com.skillstorm.training.day5;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		// CHALLENGE: Prompt user for a year. Output if it is a leap year or
		// not.
		// Put screenshot in the chat
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = in.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Yes, " + year + " is a leap year!");
				} else {
					System.out.println("No, " + year + " is not a leap year.");
				}
			} else {
				System.out.println("Yes, " + year + " is a leap year!");
			}
		} else {
			System.out.println("No, " + year + " is not a leap year.");
		}
		in.close();
		
		// We can refactor to use 
		// else-if
		
	}

}

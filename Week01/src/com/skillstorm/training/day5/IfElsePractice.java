package com.skillstorm.training.day5;

public class IfElsePractice {
	
	public static void main(String[] args) {
		System.out.println("TGIF"); // PUT A SCREENSHOT IN THE CHAT
		
		int age = 20;
		if (age >= 21) {
			System.out.println("Here's your drink.");
			System.out.println("Enjoy!");
		} else {
			System.out.println("Sorry, you are too young to purchase alcohol.");
		}
		
		// Be careful of semicolons, this will work but you can only have ONE line of code in each block
		if (age >= 21)
			System.out.println("Enjoy!");
		else
			System.out.println("Sorry, you are too young to purchase alcohol.");
		
		// 
		
		System.out.println("End of main method");
	}

}

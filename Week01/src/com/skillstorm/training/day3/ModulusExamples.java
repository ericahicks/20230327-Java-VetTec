package com.skillstorm.training.day3;

public class ModulusExamples {
	
	public static void main(String[] args) {
		// % modulus - gives the remainder from integer division
		// if I do 3 / 2 = 1.5 aka 1 remainder 1 
		// so 3 mod 2 = 1 NOT 1.5
		
		// Example: years and months
		int totalMonths = 18;
		// How may years and months is this?
		int years = 18 / 12;
		int months = 18 % 12;
		System.out.println(totalMonths + " months is " + years + " years and " + months + " months");
		
		
		// Example: what time will it be in 71 hours?
		int now = 1400;
		int timeIn71Hours = (now + 7100) % 2400;
		System.out.println(timeIn71Hours);
		
		// What will this print out?
		int someNumber = 16; 
		System.out.println(someNumber % 2); // 0
		System.out.println(someNumber % 3); // 1 
		
		// modulus: 16 mod 2 what is 16 / 2? 8 what is 16 - (8 * 2) = 16 - 16 = 0
		//          x  mod y what is x / y? n  what is  x - (n * y)
	}

}

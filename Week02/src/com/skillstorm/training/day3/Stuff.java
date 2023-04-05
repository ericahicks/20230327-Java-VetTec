package com.skillstorm.training.day3;

// TERMINOLOGY
/*
 * class variable: a static variable defined at the class level 
 *   - static means _________________
 * instance variable: a non-static variable defined at the class level 
 *   - instance means __________________
 * local variable: a variable declared in a method 
 *   - only accessible within the block of code that it is defined
 *   - parameters are accessible _____________
 *   - if-block inside variable declarations are only accessible __________
 */
public class Stuff {
	// ------------------class variables----------------------------
	// This variable is class scope and available to all the methods
	static int x = 1;
	
	//------------------instance variables---------------------------------
	// This variable is class scope and is accessible to NON-STATIC methods
	int y = 2;
	
	public static void main(String[] args) {
		System.out.println(x);
//		System.out.println(y); // ERROR cannot make a static reference to a non-static field y
	}
	
	public void incrementY() {
		y = y + 1;
	}
}




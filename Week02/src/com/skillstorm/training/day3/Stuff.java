package com.skillstorm.training.day3;

// TERMINOLOGY
/*
 * class variable: a static variable defined at the class level 
 *   - static means it belongs to the class (not an object of that class type)
 * instance variable: a non-static variable defined at the class level 
 *   - instance means it is only accessible by an object of this class type
 * local variable: a variable declared in a method 
 *   - only accessible within the block of code that it is defined
 *   - parameters are accessible everywhere inside the method
 *   - if-block inside variable declarations are only accessible in that if-block 
 *      -- not even in the else block
 *      -- only between the curly braces it is defined
 */
public class Stuff {
	// ------------------class variables----------------------------
	// This variable is class scope and available to all the methods
	static int x = 1;
	
	//------------------instance variables---------------------------------
	// This variable is class scope and is accessible to NON-STATIC methods
	int y = 2;
	
	public static void main(String[] args) {
		int x = 100;
//		System.out.println(x);
//		System.out.println(Stuff.x);
//		System.out.println(y); // ERROR cannot make a static reference to a non-static field y
		String str = new String();
		Stuff a = new Stuff();
		Stuff b = new Stuff();
		a.incrementY();
		System.out.println(a.y); // 3
		System.out.println(b.y); // 2
//		incrementY();
	}
	
	public void incrementY() {
//		int y = 10;
//		System.out.println(y);
//		System.out.println(this.y); // built in java keyword that refers to the current object we are using
		this.y = this.y + 1;
	}
}




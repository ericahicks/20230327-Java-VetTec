package com.skillstorm.training.day1.enthuware;

public class TestClass {
	/*
	 * Definition of operators
	 * && logical AND returns true if BOTH are operands are true
	 * &  bitwise AND compares the bits in the two operands and sets 1 and 1 to 1 else it sets the bit to 0
	 *     0101
	 *     0011
	 *     ----
	 *     0001
	 * || logical OR returns true if either or both operands are true
	 * 
	 * |  bitwise if either bit is 1 it returns 1 else it returns 0
	 *     0101
	 *     0011
	 *     ----
	 *     0111
	 * 
	 * short circuit rules
	 * -- for && it will short circuit when the first operand is false
	 * -- for || it will short circuit when the first operand is true
	 */
	public static void main(String args[]) {
		int i = 0;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool = false;
		bool = (bool2 & method1(i++)); // doesn't shortcircuit bc bitwise so i = 1 
		bool = ( bool2 && method1(i++) ); // does shortcircuit so i = 1
		bool = ( bool1 | method1(i++) ); // doesn't shortcircuit bc bitwise i = 2
		bool = ( bool1 || method1(i++) ); // does shortcircuit so i = 2
		System.out.println(i); 
		
	} 
	
	public static boolean method1(int i){ 
			return i>0 ? true : false;  // ternary operator - test if the condition is true, 
										// if it is it returns the first value, 
										// else returns second
	} 
		
}
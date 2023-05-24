package com.skillstorm.training.day2;

public class NumberLiterals {
	
	public static void main(String[] args) {
		//////////////////////////////////////////////////
		// Number literals (resource https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
		//////////////////////////////////////////////////
		int x = 1; 
//		float y = 1.0; // doesn't work bc 1.0 is a double
//		float z = 14e123; // doesn't work bc it is a double trying to fit in a float
		double a = 14e123; // scientific notation 14 x 10^123 is a double
		int b = 1_000_000; // underscores are ignored
//		double c = 1_.000; // not valid no _ next to a decimal
//		double e = 1._000; // not valid
//		double g = 1.333_222_1234_224 // valid
		
		// The number 26, in decimal
		int decVal = 26;
		//  The number 26, in hexadecimal
		int hexVal = 0x1a;
		// The number 26, in binary
		int binVal = 0b11010;
		
		//////////////////////////////////////////////////////////
		// Aside on char vs short number types
		//////////////////////////////////////////////////////////
		char c = '0'; // is a number but is not a value of 0
		c = (char) ('0' + '0'); // equals a `
		
		// same number of bits as a short BUT 
		// short 16 bits so range is -32,000 to +32,000 (formula being -2^15 to the +2^15  - 1)
		// char 16 bits but range is 0 to 64,000
		System.out.println(c);
		short value = -125;
		System.out.println(value);
		c = (char) value; 
		System.out.println((int) c);
		System.out.println(Integer.toBinaryString(value));
		System.out.println(Character.MAX_CODE_POINT);
		char h = 0x1122; // hexidecimal notation
	}

}

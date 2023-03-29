package com.skillstorm.training.day3;

public class AssignmentOperators {

	public static void main(String[] args) { // shortcut type: main CTRL-SPACE 
		
		// Assignment
		int value = 8;
		value = 10; // overwrites
		value = value + 2; 
//		value = 10 + 2;
//		value = 12;
		System.out.println("value=" + value);
		
		value = value + value + value + value;
//		value = 12 + 12 + 12 + 12;
//		value = 48;
		System.out.println("value=" + value);
		
		int value2 = 20;
		value2 += 100; // shorthand for value2 = value2 + 100 "SYNTATICAL SUGAR"
//		value2 = value2 + 100;
//		value2 = 20 + 100;
//		value2 = 120;
		System.out.println("value2=" + value2);
		
		
//		int value3 += 30; // Java gets confused when it sees
//		int value3 = value3 + 30; // I don't know what value3 is
		
		
		int value3 = 30;
		value3 -= 20; // short hand for value3 = value3 - 20
		value3 *= 10; // short hand for value3 = value3 * 10
		value3 /= 5; // shorthand for value3 = value3 / 5
		System.out.println("value3=" + value3);
		
		
		// Unary operators
		// incrememt operator
		int value4 = 0;
		value4++; // shorthand for value4 = value4 + 1
		System.out.println("value4=" + value4);
		value4++; // shorthand for value4 = value4 + 1
		System.out.println("value4=" + value4);
		value4++; // shorthand for value4 = value4 + 1
		System.out.println("value4=" + value4);
		value4++; // shorthand for value4 = value4 + 1
		System.out.println("value4=" + value4);
		value4++; // shorthand for value4 = value4 + 1
		System.out.println("value4=" + value4);
		
//		((value4++)++)++; // can't do this
		
		// decrement
		int value5 = 10;
		value5--;
		System.out.println("value5=" + value5);
		value5--;
		System.out.println("value5=" + value5);
		value5--;
		System.out.println("value5=" + value5);
		value5--;
		System.out.println("value5=" + value5);
		
		
		// Challenge: Take screenshot
		// What does the below code print out?
		int try1 = 5;
		System.out.println("try1++=" + try1++); // returns the value in try, and then increments try1
		System.out.println("try1=" + try1);
		
		//---------------------------------------
		// prefix vs postfix
		int try2 = 5;
		System.out.println("++try2=" + ++try2); // increments try2 and then returns the value stored in try2
		System.out.println("try2=" + try2);
		
		int number = 1;
		// storing the value returned by prefix
		int prefixResult = ++number;
		System.out.println("prefixResult=" + prefixResult);
		System.out.println("number=" + number);
		
		// storing the value returned by postfix
		int anotherNumber = 1;
		int postfixResult = anotherNumber++;
		System.out.println("postfixResult=" + postfixResult);
		System.out.println("anotherNumber=" + anotherNumber);
	}
}

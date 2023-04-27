package com.skillstorm.training.day4.enthuware;

public class DeclaringAndInitializing {

	public static void main(String[] args) {
		// Which initializations and declarations are valid?

		int a;
		a = 1;

//		 int x = y = 1; // can't chain initialization during declaration

		int b, c;
		b = c = 1; // can chain initialization if already declared

//		 int e = d = a; // can't chain initialization during declaration

		int f, g;
		f = g = a;
		// Problem 8
		// Order of operations
		// bitwise happen before logic
		// logic happen before assignment
		boolean b1 = false;
		boolean b2 = false;
//		 if (b2 != b1 = !b2) {    // same as saying:
//		 if ((b2 != b1) = !b2) {    // false = !b2 
		// Exception in thread "main" java.lang.Error: Unresolved compilation
		// problem:
		// The left-hand side of an assignment must be a variable

		// would have worked with the parenthesis here
//		if (b2 != (b1 = !b2)) { // false = !b2
		System.out.println("true");
	}

}

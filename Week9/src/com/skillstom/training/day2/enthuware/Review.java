package com.skillstom.training.day2.enthuware;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.*; // imports all classes in the package, this does not import subpackages classes

// other type of import
import static java.lang.Math.*; // import all the static members
import static java.lang.Math.PI; // import a static property

public class Review {

	public static void main(String[] args) throws Exception {
		/////////////////////////////////////////////////////////////////
		// Problem 51 -- Garbage collection
		//  variable lifespan is related to variable scope
		//  - when the scope that the variable is defined in ends, it is eligible for garbage collection
		//  - when there are no longer any references to the object
		Parent p = new Parent();
		Object[] objs = new Object[3];
		objs[0] = p;
		objs[1] = objs[0];
		p = null;
		objs[0] = null;
		// is the Parent eligible for garbage collection?
		// not yet, there is still one reference
		objs[1] = null;
		// Now, it is eligible for garbage collection
		
		
		

		/////////////////////////////////////////////////////////////////
		// Problem 21 -- Inheritance and Checked exceptions
		// If a parent method throws (a) checked exception(s)
		// what exceptions may the child class's method throw?

		// Method overriding rules
		// visibility -- we can increase the visibility without breaking the
		// parent
		// return type -- can be a more specific (child) type
		// checked exceptions -- can throw fewer or more specific (child) types
		// runtime exceptions -- can throw as many as want because no contract
		// is broken

		// covariant = more specific (child) types
		// contravariant = more general (parent) types

		///////////////////////////////////////////////////////////
		// Problem 24 -- package imports
		// If I have imported a class using a normal import
		ArrayList lst = new ArrayList();
		// If I have not imported the class,
		// I need to specify the full name java.util.LinkedList not
		// util.LinkedList etc.
		java.util.LinkedList l = new java.util.LinkedList();
//		util.LinkedList l2;
		double x = PI;
		double y = E; // Math.E; if not statically imported

		////////////////////////////////////////////////////////////////
		// Problem 42 -- order of operations is the NullPointerException or the Exception("Some Exception")
		int[] a = null;
//		int i = a[m1()];
		
		////////////////////////////////////////////////////////////////
		// Problem 11 -- The else statement is always tied to the most recent if statement
		 if (args[0].equals("open"))          
			 if (args[1].equals("someone"))             
			     System.out.println("Hello!");       
		else System.out.println("Go away "+ args[1]); // this is connected to the if (ars[1]...
		
		
	}

	public static int m1() throws Exception {
		throw new Exception("Some Exception");
	}

}

class Parent {

	void talk() throws IOException {
	}

	Parent get() {
		return this;
	}

	// numeric primitives we can cast between
	// byte -> short -> char -> int -> long -> float -> double
	// boolean

}

class Child extends Parent {
	@Override
	void talk() {
	} // fewer or more specific ok
	// throws Exception { } - does not match parents throws clause
	// throws FileNotFoundException { } - okay because does not violate parent
	// throws clause "contract"

	@Override
	Child get() {
		return this;
	}
}

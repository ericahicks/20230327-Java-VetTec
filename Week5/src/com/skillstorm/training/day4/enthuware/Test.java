package com.skillstorm.training.day4.enthuware;

public class Test {
	// STATIC properties are set when the class loads
	// STATIC blocks only run once 
	static int a; // default 0
	
	static {
		a++;
		a--;
	}
	int b; // default 0
	// instance block "anonymous block"
	{
		b = 100;
		b = 0;
		// as much code as I want in this block
		// it gets run everytime a constructor is called
		// it runs before the code in my constructor
	}

	public void incr() {
		int c = a++; // postfix
		b++; // postfix
		c++; // postfix
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String args[]) {
		Test test = new Test(); // this instance1
		test.incr();
		a++; // this change to a will not get overwrittten by the next line
		test = new Test(); // and this instance2 both have the same a value in memory whereas they have different b values
		test.incr();
	}
}

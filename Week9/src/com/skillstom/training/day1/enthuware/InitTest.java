package com.skillstom.training.day1.enthuware;

public class InitTest {
	// NOTE
	// all instance properties and all anonymous blocks
	//  defined outside of the constructor are inserted into the constructor for you above your code
	//  
	// NOTE
	// all static properties and all static blocks are run once 
	//  before the first instance of this class is created
	public InitTest() {
		super();
		// instance properties defined outside the constructor run after super before the below code
		s1 = sM1("1");
	}

	static String s1 = sM1("a");
	String s3 = sM1("2");
	{
		s1 = sM1("3");
	}
	static {
		s1 = sM1("b");
	}
	static String s2 = sM1("c");
	String s4 = sM1("4");

	public static void main(String args[]) {
		InitTest it = new InitTest();
	}

	private static String sM1(String s) {
		System.out.println(s);
		return s;
	}
}
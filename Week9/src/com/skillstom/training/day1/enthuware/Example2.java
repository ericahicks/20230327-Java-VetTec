package com.skillstom.training.day1.enthuware;

public class Example2 extends Test {
	
	public static void main(String[] args) {
		System.out.println("main");
		new Example2();
		// Expected print statments are:
		/*
		 * static     //        parent static blocks are run before the child class's static blocks
		 * q          // NOTE: static blocks are run before any static methods of the class are run
		 * main
		 * Test
		 * s
		 * Example2
		 */
	}
	
	String s;
	static String q;
	
	{
		System.out.println("s");
	}
	
	public Example2() {
		super();
		System.out.println("Example2");
	}
	
	static {
		System.out.println("q");
	}

}

class Test {
	static {
		System.out.println("static");
	}
	public Test() {
		System.out.println("Test");
	}
}

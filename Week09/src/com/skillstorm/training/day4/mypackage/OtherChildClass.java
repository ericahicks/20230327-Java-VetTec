package com.skillstorm.training.day4.mypackage;

public class OtherChildClass extends MyClass {

	// Does child class have access to MyClass's instance variables?
	public void doStuff() {
		MyClass mc = new MyClass();
//		System.out.println(mc.a);
//		System.out.println(mc.b);
//		System.out.println(mc.c);
//		System.out.println(mc.d);
	}
	
	public void doStuff2() {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}

}

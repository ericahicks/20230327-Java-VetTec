package com.skillstorm.training.day4.otherpackages;

import com.skillstorm.training.day4.mypackage.MyClass;

public class OtherPackageChildClass extends MyClass{
	

	// Do child classes in other packages have access to MyClass's instance variables?
	public void doStuff() {
		MyClass mc = new MyClass();
//		System.out.println(mc.a);
//		System.out.println(mc.b);
//		System.out.println(mc.c);
//		System.out.println(mc.d);
	}
	
	// Accessed using inheritance instead of accessed using a variable?
	public void doStuff2() {
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
	}

	public void doStuff3() {
		OtherPackageChildClass opcc = new OtherPackageChildClass();
//		System.out.println(opcc.a);
//		System.out.println(opcc.b);
//		System.out.println(opcc.c);
//		System.out.println(opcc.d);
	}

}

package com.skillstorm.training.day4.otherpackages;

import com.skillstorm.training.day4.mypackage.MyClass;

public class OtherPackageClass {
	

	// Do classes in other packages have access to MyClass's instance variables?
	public void doStuff() {
		MyClass mc = new MyClass();
//		System.out.println(mc.a);
//		System.out.println(mc.b);
//		System.out.println(mc.c);
//		System.out.println(mc.d);
	}

}

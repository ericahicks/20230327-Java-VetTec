package com.skillstorm.day3.mypackage;

public class YourClass {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println("a=" + mc.a);
		System.out.println("b=" + mc.b);
		System.out.println("c=" + mc.c);
//		System.out.println("d=" + mc.d); // private can only be accessed in the
											// same class
		// The field MyClass.d is not visible
	}

}

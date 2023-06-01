package com.skillstorm.day3.otherpackage;

import com.skillstorm.day3.mypackage.MyClass;

public class ChildClass extends MyClass {
	
	public String toString() {
		return "a=" + a +", b=" + b; //  + ", c=" + c + ", d=" + d; // private AND package private NOT inherited
	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println("a=" + mc.a);
//		System.out.println("b=" + mc.b); // accessed using a variable instance of the parent
//		System.out.println("c=" + mc.c); // package private not accessible here
//		System.out.println("d=" + mc.d); // private not accessible here
	}

	public void print() {
		MyClass mc = new MyClass();
		System.out.println("a=" + mc.a);
//		System.out.println("b=" + mc.b); // does not work
		
		System.out.println("a=" + this.a);
		System.out.println("b=" + this.b); // accessed using inheritance
//		System.out.println("c=" + c);
//		System.out.println("d=" + d); // private fields are not inherited
	}
	
	public static boolean compare(MyClass o1, MyClass o2) {
		if (o1.a != o2.a)
			return false;
//		if (o1.b != o2.b) // not accessible Parent type instance vs inherited field being accessed
//			return false;
//		if (o1.c != o2.c)
//			return false;
//		if (o1.d != o2.d)
//			return false;
		return false;
	}

}

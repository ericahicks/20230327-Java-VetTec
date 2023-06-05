package com.skillstorm.training;
// RULE: methods override and variables hide (aka shadow)
public class OverridingVsHiding {
	public static void main(String[] args) {
		X x = new Y();
//		X x2 = new Z();
		System.out.println("x's num=" + x.num);
		x.getNum();
		
//		System.out.println("x2's num=" + x2.num);
		
//		x.doStuff();
//		x2.doStuff();
		
//		x.doMore(); // what's up with the yellow underline?
//		x2.doMore(); // this is a static method and should be accessed in a static way
	}
}

class X {
	int num = 1;
	void doStuff() {
		System.out.println("X");
	}
	static void doMore() {
		System.out.println("XX");
	}
	

	void getNum() {
		System.out.println(num);
	}
}

class Y extends X {
	int num = 2;
	void doStuff() {
		System.out.println("Y");
		System.out.println(num);
		System.out.println(super.getClass());
		System.out.println(super.num);
	}
	
	void getNum() {
		System.out.println("Y's num=" + num);
	}

	static void doMore() {
		System.out.println("YY");
	}
}

class Z extends X {
	int num = 3;

	void doStuff() {
		System.out.println("Z");
	}

	static void doMore() {
		System.out.println("ZZ");
	}
}

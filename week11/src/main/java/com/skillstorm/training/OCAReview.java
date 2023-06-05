package com.skillstorm.training;

public class OCAReview {
	
	public static void main(String[] args) {
		B b = null;
		D d = new D(); // D -> C -> A -> Object
		D d2 = new D();
		A a = new A();
		A a2 = new A("a");
	}

}

class A {
	{
		System.out.println("A");
	}
	public A() { }
	public A(String a) { }
}

class B extends A {
	static {
		System.out.println("static B");
	}
	
}

class C extends A {
	{
		System.out.println("C");
	}
	static {
		System.out.println("static C");
	}
}

class D extends C {
	static {
		System.out.println("static D");
	}
	{
		System.out.println("D");
	}
}
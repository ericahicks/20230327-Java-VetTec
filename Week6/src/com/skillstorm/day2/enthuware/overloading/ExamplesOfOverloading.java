package com.skillstorm.day2.enthuware.overloading;

public class ExamplesOfOverloading {
	int x = 1;
	
	public static void main(String args[]) {
//		int nope = this.x; // this is not visible inside static methods
		ExamplesOfOverloading eOo = new ExamplesOfOverloading();
		int myX = eOo.x; // I must create an instance to access instance fields in a static method
		eOo.method1(); // 
		A a = new A();
		B b = new B();
		A test = new B();
		eOo.method1(test); // What will print? chooses at compile time based on the variable type not the object type
		// overloading = compile time
		// overriding = run time
		test.stuff(); // What will it print? chooses at runtime based on the object type
	}
	
	public void method1() {
		
	}
	
	// How can I overload method1 ?
	// same name different parameters
	
	public void method1(int a) {
		
	}
	
	// Bad examples:
//	public void method1(int x) { // cannot have the same type and number of parameters
//		
//	}
	
//	private void method1() { // indistinguishable because the method name and parameter types are the same as above
//		
//	}
	
	// This is fine, a different access level on the same named method as long as parameters are different
	private void method1(int a, int b ) {
		
	}
	
	// The return type being different isn't enough, the parameters have to be different
//	public String method1() {
//		
//	}
	
	private void method1(String s, int x) {
		
	}
	
	private void method1(int x, String s) { // parameter order matters, so same number and type of parameters is okay if different order
		
	}
	
	public void method1(A a) {
		System.out.println("a");
	}
	
	public void method1(B b) { 
		System.out.println("b");
	}  // subtypes are different enough so method overloading is allowed here

}

class A {
	
	void stuff() { System.out.println("a stuff"); }
	
}
class B extends A { 
	
	@Override
	void stuff() { System.out.println("b stuff"); }
}

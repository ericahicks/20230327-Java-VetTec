package com.skillstorm.training.day4.enthuware;

import java.time.LocalDate;

public class EnthuwareReview {

	public static void main(String[] args) {
		//////////////////////////////////////////////
		// PROBLEM 35 OOP concepts encapsulation - See below Person and employee
		////////////////////////////////////////////// classes

		//////////////////////////////////////////////
		// PROBLEM 47 Operators and Decision statements
		boolean hasParams = (args == null ? false : true); // no arguments
															// provided means
															// args is empty not
															// null
		// ------------ ----
		// false true is returned
		// do not write code this way!

		if (hasParams) { // if (true)
			System.out.println("has params"); // does this run? yes
		}
		{ // NOTICE there is not else keyword here
			System.out.println("no params"); // does this run? yes
		}
		// Notice curly braces are allowed anywhere and create an inner block
		// scope for variables
		{
			int x = 10; // not visible outside these inner curly braces
		}
		int x = 2;
		int year = LocalDate.now().getYear();
//         String test = year == 2023 ? System.out.println("It is a good year") : System.out.println("It is a boring year");
		// ---------------------------------------
		// return type is void so type mismatch
		String test = (year == 2023) ? "It is a good year"
				: "It is a boring year";
		System.out.println(test);

		// nested ternaries
		String test2 = x > 10
				? (x < 20 ? (x < 13 ? "preteen" : "teenager") : "adult")
				: (x == 2 ? "terrible two" : "child");
		System.out.println(test2);

		//////////////////////////////////////////////////////////////////
		// Problem 27 -- See class Holder

		//////////////////////////////////////////////////////////////////
		// Problem 52
		// Prefix - updates before
		// Postfix - updates after

		// | bitwise OR
		// || logical OR
		// & bitwise AND
		// && logical AND

		// Short circuit evaluation - if the first side meets the requirment,
		// don't look at the second side
		// || short circuits when left side is true
		// && short circuits when left side is false
		// | never because needs all the bits in each operand to compare
		// & never

		// bitwise operators
		// |
		// &
		// >> fill with 1s or 0s depending on sign
		// << fill with 0s on the right
		// >>> fill with 0s on the left
		// ~ bitwise not (flip the bits)
		// ^ bitwise xor
		// 1010 1010
		// ^ 0011 | 0011
		// ---- -----
		// 1001 1011
		int i = 1;
		int j = i++; // j now is 1, i now is 2
		if ((i == ++j) | (i++ == j)) {
			// ------- --------
			// 2 == 2 2 == 2 j is now 2 and i is now 3
			//
			i += j; // does this run? yes
			// i = i + j;
			// = 3 + 2
		} // = 5 so i is now 5 and j is still 2
		System.out.println(i); // 5

		//////////////////////////////////////////////////////
		// Problem 25 Loop Constructs
		int sum = 0;
		for (i = 0, j = 10; sum > 20; ++i, --j) // 1
		{
			sum = sum + i + j;
		}
		System.out.println("Sum = " + sum);

		/////////////////////////////////////////////////////
		// Problem 1: polymorphism and overloading
		B c = new C();
		System.out.println(c.max(10, 20));
		// What is polymorphism? more than one form
		// runtime polymorphism - overriding
		// compile time polymorphism - overloading

		// What is the reference type and object type of:
		A stuff = new B(); // reference type is A and object type is B
		A stuff2 = new C(); // reference type is A and object type is C
		B stuff3 = new C(); // refrence type is B and object type is C

		// Which of these will compile?
		A q1 = new B();
//		  B q2 = new A(); // won't compile bc A is a supertype of B and cannot be stored in a B referenc type
		// to call a static method you should not use an object instead use
		A.doStuff();
		q1.doStuff(); // what will print? a -- exception is for static methods
						// use the reference type
		q1.doStuff2(); // what will it print? bb -- object type is used to
						// decide what overridden method
//		 q1.doStuff3(); // compilation error no method doStuff3 in reference type A
		
		Object d = 10;
		System.out.println(d instanceof Integer);

		/////////////////////////////////////////////////////
		// Problem 56 Java Data Types - Nested Inner classes
		// see InnerAndOuterClasses file

	}

	// What exception is thrown?

	// What overriding, which is valid?

	// Post-fix and Pre-fix

	// Static methods

	// Access modifiers

}
/*
 * // ENCAPSULATION - limiting access to change or view data // FULLY
 * ENCAPSULATED CLASS - all variables are private // GETTERS/SETTERS rules // -
 * must be public // - setters should be: // public void setName(type var) // -
 * getters should be: // public type getName() // public boolean
 * isPropertyName() // -- exception to the naming rule, // for booleans you can
 * use is instead of get //
 */

// fully encapsulate person
class Person { // can be public bc can't be changed
	public static final int MAX_POPULATION = 100000; // don't have setter bc
														// constant
	private int age;
	// Insert code here

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Employee extends Person {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setAge(29);
		System.out.println(e.getAge());
	}
}

// Overriding methods
class A {
	int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	static void doStuff() {
		System.out.println("a");
	}

	void doStuff2() {
		System.out.println("aa");
	}
}

class B extends A {
	int max(int x, int y) {
		return 2 * super.max(x, y);
	}

	static void doStuff() {
		System.out.println("b");
	}

	void doStuff2() {
		System.out.println("bb");
	}
	
	void doStuff3() {
		System.out.println("bbb");
	}
}

class C extends B {
	int max(int x, int y) {
		return super.max(2 * x, 2 * y);
	}
}

class Base {
	void methodA() {
		System.out.println("base - MethodA");
	}
}

class Sub extends Base {
	public void methodA() {
		System.out.println("sub - MethodA");
	}

	public void methodB() {
		System.out.println("sub - MethodB");
	}
	
	// COMPILER CHECKS you can only call methods that exist in the reference type irregardless of the object type
	public static void main(String args[]) {
		Base base = new Sub(); // 1
		base.methodA(); // 2 uses object type at runtime because this is overriding (r as in runtime) not overloading (l as in compile time)
//		b.methodB(); // 3 This won't work -- compile time error 
	}
}

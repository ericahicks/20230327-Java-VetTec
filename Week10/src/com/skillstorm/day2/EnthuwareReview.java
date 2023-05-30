package com.skillstorm.day2;

public class EnthuwareReview {
	// 13

	// 14 Loops
	// Reserved words: for, while, do, if, else, modifiers, primitive types,
	// try, catch, finally
	// continue, break, goto, strictfp, const, assert
	// NOT reserved are all the names of the built-in classes like String,
	// Integer, Character, etc.
//	public static void main(String[] args) {
//		int i = 0, j = 0;;
//	    /* for  :*/ 
//		outer: for(i = 0; i< 10; i++){ // reserved words in java that cannot be used
//	         for (j = 0; j< 10; j++){  // for variable names or label names
//	              if ( i + j > 10 )  break outer; //for;
//	         }
// 	         System.out.println( "hello i " + i + ", j " + j);
//	      }
//	}

	// 17 Inheritance and constructors
	// - If we do not provide a constructor, Java gives us a default constructor
	// with no-args
	// - If I do define define a constructor with parameters, I do NOT get a
	// default no-arg constructor
	// - Inside a constructor the first line can be a call to super or this
	// - If we don't call super, automatically it gets called for us using
	// no-arguments
	// - A constructor does not have a return type
//	public static void main(String[] args) {
//		B b = new B();
//	}

	// 29

	// 30

	// 34

	// 43

	// 48
	// break = breaks the loop it is in (not any outer loops) stopping all the
	// break label = breaks the labeled loop (not any other loops from it)
	// rest of the iterations
	// continue = continue only skips the current interation (all the rest of
	// the iterations run)
	public static void main(String[] args) {
		int counter = 0;
		outer: for (int i = 0; i < 3; i++) {
			middle: for (int j = 0; j < 3; j++) {
				inner: for (int k = 0; k < 3; k++) {
					/*
					 * i j k
					 * 0 0 0 +
					 * 0 0 1 nope
					 * 1 0 0 +
					 * 1 0 1 nope
					 * 2 0 0 +
					 * 2 0 1 nope
					 * 
					 */
					if (k > 0) {
						break middle;
					}
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}

class A {
	public A() {
		System.out.println("A");
	}

	public A(String str) {
		System.out.println("A with " + str);

	}
}

class B extends A {
	// This has the default constructor

	public int B(String s) { // this is a method that returns and int and has a
								// very poorly chosen name
		System.out.println("B :" + s);
		return 0;
	}
}

class C extends B {
	private C() {
		super();
	}

	public C(String s) {
		this(); // what does this line do? it calls the no-arg constructor which
				// calls B() which calls A()
		System.out.println("C :" + s);
	}

	public C(int i) {
	} // this implicitly calls B() which calls A() which calls Object()
}

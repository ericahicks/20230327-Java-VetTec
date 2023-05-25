package com.skillstorm.training.day3;

public class EnthuwareReview2 {

	public static void main(String[] args) throws Throwable {
		// Order of Operations
		// What will the following print?
		int c = 1; // 1
		c = c++; // returns the old value and then increments c
		// Tricky if you think of assignment as happening first and then
		// postfix.
		System.out.println(c);

		///////////////////////////////////////////////////////////////////////////
		//            -- arrays are 0 indexed so the last index is at length - 1
		// Problem 12 -- The toString method of an Exception prints just the class and the message not the cause or strack trace
		try {
			throw  new Throwable("Message");
		} catch (Throwable t) {
			Throwable t2 = new Throwable("Message ", t); // checked
			System.out.println(t2);
			t2.printStackTrace();
		}
	}

}

class MyException0 extends Throwable{}
class MyException1 extends MyException0{}
class MyException2 extends MyException0{}
class MyException3 extends MyException2{}

class ExceptionTest {
	void myMethod() throws MyException0 {
		throw new MyException3();
	}

	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		try {
			et.myMethod();
		} catch (MyException0 me) { // Rule is the catch block order must be MOST specific to LEAST specific
			System.out.println("MyException thrown");
//		} catch (MyException3 me3) {
//			System.out.println("MyException3 thrown"); // dead code fails to compile
		} finally {
			System.out.println(" Done");
		}
	}
}
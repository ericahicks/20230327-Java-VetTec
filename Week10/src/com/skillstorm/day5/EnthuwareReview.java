package com.skillstorm.day5;

public class EnthuwareReview {

	public static void main(String[] args) throws Throwable {
//		throw new String("No that didn't work"); // must be an object of type subclass of Throwable
//		throw new Throwable();
//		throw new Error();
//		throw new RuntimeException();
		try {
			throw null;
		} catch (Exception e) {
			System.out.println(e);
		}

//		try {
//			RuntimeException re = null; // if we try and call a method on this object, nullpointerexception
////			throw re; // compiler does type checking not looking at the values
//						// so no compilation error
////			throw new NullPointerException("some message here");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	}
}

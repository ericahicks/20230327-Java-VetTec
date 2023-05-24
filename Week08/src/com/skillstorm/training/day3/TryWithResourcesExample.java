package com.skillstorm.training.day3;

import java.util.Scanner;

public class TryWithResourcesExample {
	public static void main(String[] args) throws Exception {
		// try-with-resources blocks
		// -- can be used instead of try-catch-finally to close resources
		// -- can only be used with objects that implement AutoCloseable
		// -- Java calls the close methods for us, in the opposite order the
		// objects were created
		// -- catch and finally blocks run AFTER the close methods are called

		try (Scanner in = new Scanner(System.in); //
				Stuff s = new Stuff(); // s only exists inside the try-block NOT
										// inside the catch or finally block
				MoreStuff s2 = new MoreStuff();
				EvenMoreStuff s3 = new EvenMoreStuff()) {
			in.next();
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("Something went wrong");
//			s.close(); // s has already been closed
		} finally {
			System.out.println("Now the finally block has run");
//			s.close(); // s has already been closed
		}
	}
}

class Stuff implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing the stuff");

	}

}

class EvenMoreStuff implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing the even more stuff");

	}

}

class MoreStuff implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing the more stuff");

	}

}
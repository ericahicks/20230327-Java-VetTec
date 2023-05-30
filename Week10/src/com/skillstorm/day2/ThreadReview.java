package com.skillstorm.day2;

public class ThreadReview {
	// REMEMBER: method signature = the name and parameters NOT accessors or throws or return type etc.
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(() -> System.out.println("Thread 1"));
		Thread t2 = new Thread(() -> System.out.println("Thread 2"));
		t.start();
		t2.start();
//		t.run(); // we should never do this, let the operating system decide when to run
//		t2.run(); // this does not start a new thread
		
		// how to tell the main thread to print the below after the threads finish
		t.join();
		t2.join();
		System.out.println("main");
		
		// Valid lambdas for the Thread constructor above are:
		// Runnable is the type of object the lambda is being turned into
		// public void run()
		/*
		 * Lambda notation rules:
		 * 1. () required when there are 0 or more than one parameters
		 * 2. {} required when there are more than one statements
		 * 3. return is required when more than one statement or or one statement inside of { }
		 */
		// Note: return; is allowed in void methods because it returns void
		Runnable r = () -> System.out.println("Hello");
//		Runnable r2 = (x) -> System.out.println("Hello" + x); // does not match signature of functional interface's method
		// method signature = 
	}

}

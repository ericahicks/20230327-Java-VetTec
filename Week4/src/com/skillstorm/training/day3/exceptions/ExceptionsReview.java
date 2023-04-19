package com.skillstorm.training.day3.exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionsReview  {

	public static void main(String[] args) throws Exception {
		/*
		 * What is an exception?
		 * - something that occurs during the execution of the program
		 *   that interrupts the normal flow
		 * 
		 * 
		 * What are some exceptions we've seen?
		 * - unchecked
		 *    -- ArithmeticException
		 *    -- ClassCastException
		 *    -- RuntimeException
		 *    
		 * - checked
		 *    -- Throwable
		 *    -- Exception
		 *    -- IOException
		 * 
		 * 
		 * Exception Objects can have certain properties and methods
		 *  - String message
		 *  - Throwable cause
		 *  - stacktrace (method that "calculates" the stack trace of what methods were calling what)
		 *  - getClass() -- the type is important to our user to understand what went wrong
		 * 
		 *
		 * Why does java throw exceptions what's the point?
		 * - because something unexpected happened and we need to communicate that to our user
		 * - checked exceptions -- to enforce best practices and make sure all programs anticipate common scenarios
		 * 
		 * 
		 * Question: Is and Infinite Loop an exception?
		 * - no!
		 * - our program just continues
		 * - java's exception mechanism won't stop us
		 * 
		 * 
		 * Question: What happens if a catch block's code throws an exception?
		 * - If a catch block's code throws and exception it is going to propagate 
		 *   down the call stack to the next method in the stack and potentially main 
		 * 
		 * 
		 */
		////////////////////////////////////////////////////////////////////////
		// TODO throw any exception you want and throw a screenshot in the chat
		// Example 1: Throw an exception of your choosing
//		throw new ArithmeticException("Math is hard, I know. But you can't do that.");
//		throw new Exception();
		
		// Example 1b: Throwing an exception with a cause
//		throw new RuntimeException("Something went wrong, sorry",
//				                    new Exception("This was what happened."));
		
		
//		throw new RuntimeException()
		// Example 2: Thrown exception in catch block
//			try {
//				throw new ArithmeticException("1");
//			} catch (ArithmeticException e) {
//				throw new ArithmeticException("2"); // This will "supress"
//			}
//			System.out.println("Reached end of main");
			
		// Example 2b: Thrown exception in catch block
		//   Concepts to remember
		//    0. Java is multithreaded so the print statements could run in any order
		//    1. Only one catch block ever runs
		//    2. Finally block always runs
			try {
				throw new ArithmeticException("1");
			} catch (ArithmeticException e) {
				throw new ArrayIndexOutOfBoundsException("2");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught exception " + e.getLocalizedMessage());
			} finally {
				System.out.println("Reached finally block");
			}
			System.out.println("Reached end of main");
		}

}

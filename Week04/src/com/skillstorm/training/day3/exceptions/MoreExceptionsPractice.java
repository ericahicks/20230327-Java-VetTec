package com.skillstorm.training.day3.exceptions;
import java.io.IOException;

public class MoreExceptionsPractice {
	
	public static void main(String[] args) throws IOException, CustomException {

		///////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////// Checked Exceptions /////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		// Checked Exception -- I must declare this using the "throws keyword"
		//                   -- Or handle the exception using a try-catch blck
		
		// Example 1: Throwing a Built-in Checked Exceptions 
//		throw new IOException();
		// Example 2: Throwing a Custom Checked Exception
//		throw new CustomException();
//		throw new CustomException("Uhoh");
//		throw new CustomException("Uhoh", new IOException("Didn't work for some reason"));
		
		try {
			throw new IOException();
		} catch (IOException e) {
			throw new CustomException("Uhoh", e); // we will decide to do this to give users a more specific exception
		}
	}

}

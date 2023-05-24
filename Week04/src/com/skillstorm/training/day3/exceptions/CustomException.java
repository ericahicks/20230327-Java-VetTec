package com.skillstorm.training.day3.exceptions;

// Naming convention: Always have your custom Exception class's name end with "Exception"
public class CustomException extends Exception {
	
	// Don't worry about the needs to be serialized warning
	// serializing is a step that is used when information is sent over a network,
	// which we don't have to worry about right now
	private static final long serialVersionUID = -5920059795517944333L;
	
	// Add a no-arg constructor
	public CustomException() {
//		super(); // this is called for me
//		super("This is my custom message"); // I can do this if I want but I'll just let it call the no-arg
	}
	
	// Add a constructor that takes in a message
	public CustomException(String message) {
		super(message); // required - won't automatically call super with my parameter (defaults to calling no-arg)
	}
	
	// Add a constructor that takes in a message and a cause
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}
	

}

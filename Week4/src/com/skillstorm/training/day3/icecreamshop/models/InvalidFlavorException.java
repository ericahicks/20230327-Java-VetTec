package com.skillstorm.training.day3.icecreamshop.models;

public class InvalidFlavorException extends Exception { // To view the source code for Exceptin CTRL+click
	
	public InvalidFlavorException() {
		
	}
	
	public InvalidFlavorException(String message) {
		super(message);
	}
	
	public InvalidFlavorException(String message, Throwable cause) {
        super(message, cause);
    }
}

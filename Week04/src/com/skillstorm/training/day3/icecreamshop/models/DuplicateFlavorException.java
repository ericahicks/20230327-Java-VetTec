package com.skillstorm.training.day3.icecreamshop.models;

public class DuplicateFlavorException extends Exception { // To view the source code for Exceptin CTRL+click
	
	public DuplicateFlavorException() {
		
	}
	
	public DuplicateFlavorException(String message) {
		super(message);
	}
	
	public DuplicateFlavorException(String message, Throwable cause) {
        super(message, cause);
    }
}


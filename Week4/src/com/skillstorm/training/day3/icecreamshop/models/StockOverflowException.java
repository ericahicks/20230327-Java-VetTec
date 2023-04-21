package com.skillstorm.training.day3.icecreamshop.models;
// Custom exception
// 1. To make it checked extend Throwable or Exception
// 2. Add constructors
public class StockOverflowException extends Exception { // To view the source code for Exceptin CTRL+click
	
	public StockOverflowException() {
		
	}
	
	public StockOverflowException(String message) {
		super(message);
	}
	
	public StockOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

}

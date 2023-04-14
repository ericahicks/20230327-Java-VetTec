package com.skillstorm.training.day5.classes;

import com.skillstorm.training.day5.interfaces.Closeable;
import com.skillstorm.training.day5.interfaces.Openable;

public class Door implements Openable, Closeable {
	public void close() { // has to be public or breaks the interface "contract" that anyone can access this method
		System.out.println("Door is now closed.");
	}
	
	public void open() {
		System.out.println("Door is now open.");
	}
}

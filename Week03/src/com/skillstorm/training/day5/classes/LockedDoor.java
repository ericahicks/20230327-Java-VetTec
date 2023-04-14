package com.skillstorm.training.day5.classes;

import com.skillstorm.training.day5.interfaces.Lockable;

public class LockedDoor extends Door implements Lockable {
	public void lock() {
		System.out.println("Door is now locked.");
	}
	public void unlock() {
		System.out.println("Door is now unlocked.");
	}

}

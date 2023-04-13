package com.skillstorm.training.day4.models;

public class Car {
	
	private int amountOfDoors;
	
	public Car() {
		this.amountOfDoors = 4;
	}
	
	public Car(int amountOfDoors) {
		this.amountOfDoors = amountOfDoors;
	}
	
	public int getAmountOfDoors() {
		return amountOfDoors;
	}
	
	public void setAmountOfDoors(int amountOfDoors) {
		this.amountOfDoors = amountOfDoors;
	}
	
	public String toString() {
		return "This is a " + amountOfDoors + " door car.";
	}
}

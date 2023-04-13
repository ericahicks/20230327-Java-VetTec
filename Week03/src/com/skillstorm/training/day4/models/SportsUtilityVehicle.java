package com.skillstorm.training.day4.models;

public class SportsUtilityVehicle extends Car {
	private String owner;
	private String fourWheelDrive;
	
	public SportsUtilityVehicle() {
		// automatically calls super() so below code is optional
		super();
		this.fourWheelDrive = "Push-button four-wheel-drive";
	}
	
	public SportsUtilityVehicle(String owner) {
		this();
		this.owner = owner;
	}

	public String getFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(String fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	public String toString() { // type toString CTRL-space to generate
		return "This is a " + getAmountOfDoors() + " door SUV with "
				+ fourWheelDrive + ".";
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}

package com.skillstorm.training.day4.models;

public class Rectangle {
	// CHALLENGE fully encapsulate the rectangle class
	// fully encapsulated = all the properties are private
	// TODO Drop a screenshot in the chat
	private double height;
	private double width;
	
	public Rectangle() {
		this.height = 1;
		this.width = 1;
	}

	// getter for height
	public double getHeight() {
		return this.height;
	}

	// setter for height
	public void setHeight(double height) {
		if (height > 0)
			this.height = height;
	}

	// getter for height
	public double getWidth() {
		return this.width;
	}

	// setter for height
	// the this keyword is required when there is a name collision
	public void setWidth(double width) {
		if (width > 0)
			this.width = width;
	}
	
	// method to calculate the area of this 
	// the this keyword is optional when there are no name collisions
	public double getArea() {
		return height * width;
	}
	
	

}

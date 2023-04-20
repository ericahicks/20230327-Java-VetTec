package com.skillstorm.training.day4.officehours;

public class Shape {
	
	public static Shape getInstance(int corners) {
		switch (corners) {
		case 0:
			return new Circle();
		case 3: 
			return new Triangle();
		case 4:
			return new Rectangle();
		default:
			throw new IllegalArgumentException("Invalid number of corners");
		}
	}

}

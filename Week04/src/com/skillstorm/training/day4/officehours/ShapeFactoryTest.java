package com.skillstorm.training.day4.officehours;

public class ShapeFactoryTest {
	
	public static void main(String[] args) {
		Shape myShape = Shape.getInstance(0);
		System.out.println(myShape);
	}
	
}

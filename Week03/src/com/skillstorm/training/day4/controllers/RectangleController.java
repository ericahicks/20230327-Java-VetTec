package com.skillstorm.training.day4.controllers;
import com.skillstorm.training.day4.models.Rectangle;

public class RectangleController {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r.getHeight());
		r.setHeight(1);
		System.out.println(r.getHeight());
		
		double area = r.getArea();
		System.out.println("The area is " + area);
	}

}

package com.skillstom.training.day2.designpatterns;

public class FactoryExample {
	
	

}

class ShapeFactory {
	// TODO
}

abstract class Shape {
	int corners;
	public Shape(int corners) { }
}

class Triangle extends Shape {
	public Triangle() { super(3); }
}
class Square extends Shape { 
	public Square() { super(4); }
}

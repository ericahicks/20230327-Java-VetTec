package com.skillstorm.training;

public class InfinityExample {
	
	public static void main(String[] args) {
		double x = 10, y = 20;
		double dx, dy;
		try {
			dx = x % 5;
			dy = y / dx;
		} catch (ArithmeticException ae) {
			System.out.println("Caught AE");
			dx = 2;
			dy = y / dx;
		}
		x = x / dx;
		y = y / dy;
		System.out.println(dx + " " + dy);
		System.out.println(x + " " + y);
		System.out.println(Long.toBinaryString(Double.doubleToLongBits(dy)));
	}

}

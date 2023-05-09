package com.skillstorm.training.day2;

public class CustomStackTests {
	
	public static void main(String[] args) {
		Stack<Plate> plates = new Stack<>(3);
		System.out.println(plates);
		// Add 4 plates
		plates.push(new Plate("red", "small"));
		plates.push(new Plate("blue", "large"));
		plates.push(new Plate("green", "medium"));
//		plates.push(new Plate("white", "large"));
		System.out.println(plates);
		System.out.println("Current size is " + plates.size());
		System.out.println("Removing the " + plates.pop());
		System.out.println("Removing the " + plates.pop());
		System.out.println("Removing the " + plates.pop());
//		System.out.println("Removing the " + plates.pop());
		System.out.println("Current size is " + plates.size());

		// try adding null
//		plates.push(null);
		
		// peek when size is 0
		System.out.println(plates.peek());
	}
}

class Plate {
	String color;
	String size; // sm, med, lg
	public Plate(String color, String size) {
		this.color = color;
		this.size = size;
	}
	public String toString() {
		return size + " " + color + " plate";
	}
}

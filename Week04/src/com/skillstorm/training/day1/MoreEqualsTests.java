package com.skillstorm.training.day1;

public class MoreEqualsTests {
	
	public static void main(String[] args) {
		BetterCar bc = new BetterCar("Toyota", "Prius", "Green");
		BetterCar bc2 = new BetterCar("Toyota", "Prius", "Blue");
		System.out.println("Does a blue prius match a green prius?");
		System.out.println(bc2.equals(bc));
		
		AnotherCar ac = new AnotherCar("Subaru", "Impreza", "red");
		AnotherCar ac2 = new AnotherCar("Subaru", "Impreza", "white");
		System.out.println("Does a red subaru impreza match a whilte one?");
		System.out.println(ac.equals(ac2));
		
		AnotherCar ac3 = new SportsCar();
		ac3.setColor("blue");
		ac3.setModel("Impreza");
		ac3.setMake("Subaru");
		// If I use instanceof instead of get class
		System.out.println("Does a Subaru Impreza SportsCar match a Subaru Impreza AnotherCar?");
		System.out.println(ac.equals(ac3));
		
		
	}

}

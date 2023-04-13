package com.skillstorm.training.day4.controllers;

import com.skillstorm.training.day4.models.Car;
import com.skillstorm.training.day4.models.SportsUtilityVehicle;

public class CarController {
	
	public static void main(String[] args) {
		Car tonysCar = new Car();
		tonysCar.setAmountOfDoors(5);
		System.out.println("Tony's car has " + tonysCar.getAmountOfDoors() + " doors");
		
		SportsUtilityVehicle jaycieSUV = new SportsUtilityVehicle();
		jaycieSUV.setAmountOfDoors(4);
		System.out.println("Jaycie's SUV has " + jaycieSUV.getAmountOfDoors() + " doors");
	}

}

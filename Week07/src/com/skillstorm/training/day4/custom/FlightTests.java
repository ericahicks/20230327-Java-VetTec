package com.skillstorm.training.day4.custom;

public class FlightTests {
	
	public static void main(String[] args) {
		Flight a = new Flight();
		a.joinLine(new Passenger("Sara", 3));
		a.joinLine(new Passenger("Jane", 4));
		a.joinLine(new Passenger("John", 1));
		a.joinLine(new Passenger("Bob", 2));
		a.joinLine(new Passenger("George", 1));
		a.joinLine(new Passenger("Greg", 1));
		a.joinLine(new Passenger("Gary", 3));
		a.joinLine(new Passenger("Anna", 6));
		a.joinLine(new Passenger("Amber", 5));
		a.board();
//		System.out.println(a.passengers);
	}

}

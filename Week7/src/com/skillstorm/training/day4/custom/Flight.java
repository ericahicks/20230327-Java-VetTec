package com.skillstorm.training.day4.custom;

import java.util.Objects;
import java.util.PriorityQueue;

public class Flight {
	
	PriorityQueue<Passenger> passengers;
	
	public Flight() {
		this.passengers = new PriorityQueue<>(new PassengerComparator());
	}
	
	public void joinLine(Passenger p) {
		passengers.add(p);
	}
	
	public void board() {
		System.out.println("Boarding:");
		// loop through removing
		// for loop using the size
		for (int i = passengers.size(); i > 0 ; i--) {
			System.out.println("  " + passengers.poll());
		}
		// while loop using isEmpty
		while (!passengers.isEmpty()) {
			System.out.println("  " + passengers.poll());
		}
	}
	
	@Override
	public String toString() {
		return passengers.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(passengers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Flight other = (Flight) obj;
		return Objects.equals(passengers, other.passengers);
	}
	
	

}

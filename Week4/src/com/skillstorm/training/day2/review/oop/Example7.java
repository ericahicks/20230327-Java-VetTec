package com.skillstorm.training.day2.review.oop;

public class Example7 {

	public static void main(String[] args) {
		CarRace race = new CarRace(2);
		Car car = new Car();
		Driveable train = new Train(); // IS-A relationship
		race.add(car); // IS-A relationship
		race.add(train); 
		race.start();
	}
}

/////////////////////////////////////////////////
//Example 7:
class CarRace {
	private Driveable[] roster; // HAS-A relationship
	private int numOfRacers; // Encapsulation

	public CarRace(int max) {
		this.roster = new Driveable[max];
	}

	public void add(Driveable vehicle) {
		this.roster[numOfRacers] = vehicle;
		this.numOfRacers++;
	}

	public void start() {
		for (Driveable vehicle : roster) {
			vehicle.drive(); // runtime polymorphism
		}
	}

}
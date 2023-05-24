package com.skillstorm.training.day1;

public class Car {
	
	String make;
	String model;
	String color;
	
	// Override the equals method 
	@Override
	public boolean equals(Object other) {
		// step 1 compare memory addess
		if (other == this)
			return true;
		// step 2 compare they are they same type
		if (other.getClass() == this.getClass()) {
			// step 3 if they are, convert other to be of type car
			Car otherCar = (Car) other;
			// compare the properties of the cars
			// If it gets here, we have this and otherCar to compare
			if (this.make == null) {// WARNING DON'T CALL .equals yet
				if (otherCar.make != null) // Don't give up and return false yet, compare if the other is null too
					return false;
			}
			if (!this.make.equals(otherCar.make)) {
				return false;
			}
			if (this.model == null) {// WARNING DON'T CALL .equals yet
				if (otherCar.model != null) // Don't give up and return false yet, compare if the other is null too
					return false;
			}
			if (!this.model.equals(otherCar.model)) {
				return false;
			}
			
			
		} else {
			return false;
		}
		
		return true;
		
	}
}

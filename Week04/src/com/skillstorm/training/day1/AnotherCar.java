package com.skillstorm.training.day1;

import java.util.Objects;

public class AnotherCar {
	
	private String make;
	private String model;
	private String color;
	
	public AnotherCar() {
		
	}
	
	public AnotherCar(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "AnotherCar [make=" + make + ", model=" + model + ", color="
				+ color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AnotherCar)) // any subtype of AnotherCar should match
			return false;
		AnotherCar other = (AnotherCar) obj;
		return Objects.equals(make, other.make)
				&& Objects.equals(model, other.model);
	}
	
}

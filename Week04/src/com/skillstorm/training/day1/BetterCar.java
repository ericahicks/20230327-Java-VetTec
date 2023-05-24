package com.skillstorm.training.day1;

public class BetterCar {
	
	private String make;
	private String model;
	private String color;
	
	public BetterCar() {
		// this calls super() which runs the Object class's constructor with no-args
	}
	
	public BetterCar(String make, String model, String color) {
		// this calls super() which runs the Object class's constructor with no-args
		this.make = make;
		this.model = model;
		this.color = color;
	}

	// Generated .equals method using the options for if-blocks instead of Objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		BetterCar other = (BetterCar) obj;
		if (make == null) {
			if (other.make != null) {
				return false;
			}
		} else if (!make.equals(other.make)) {
			return false;
		}
		if (model == null) {
			if (other.model != null) {
				return false;
			}
		} else if (!model.equals(other.model)) {
			return false;
		}
		return true;
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
		return "BetterCar [make=" + make + ", model=" + model + ", color="
				+ color + "]";
	}

}

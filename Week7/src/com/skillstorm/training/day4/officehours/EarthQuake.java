package com.skillstorm.training.day4.officehours;

public class EarthQuake implements Comparable<EarthQuake> {
	
	float magnitude;
	String city;
	String state;
	
	public EarthQuake(float magnitude, String city, String state) {
		this.magnitude = magnitude;
		this.city = city;
		this.state = state;
	}

	// return negative is this less than that
	// return 0 if this == that
	// return positive if this > that
	@Override
	public int compareTo(EarthQuake that) {
		return Math.round((this.magnitude - that.magnitude) * 10);
	}
	
	// M 3.6 - Outside of Toyah, Texas
	@Override
	public String toString() {
		return String.format("M %2.1f - Outside of %s, %s", magnitude, city, state);
	}

}

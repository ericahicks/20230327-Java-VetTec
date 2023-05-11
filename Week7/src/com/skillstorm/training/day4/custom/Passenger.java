package com.skillstorm.training.day4.custom;

public class Passenger {
	String name;
	int group;
	
	public Passenger(String name, int group) {
		this.name = name;
		this.group = group;
	}
	
	@Override
	public String toString() {
		return group + " " + name;
	}
}

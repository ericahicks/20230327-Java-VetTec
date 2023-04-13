package com.skillstorm.training.day4.models;

public class Person {
	// Fully encapsulate = all the properties need to be private
	
	private String name;
	private Person bestFriend;
	
	public Person() {
		this.name = "unknown";
		
	}
	
	public Person(String name, Person bestFriend) {
		this.name = name;
		this.bestFriend = bestFriend;
	}
	
	public String getName() {
		return this.name;
	}
	
	// Setter for the name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for bestFriend
	public Person getBestFriend() {
		return this.bestFriend;
	}
	
	// Setter for bestFriend
	public void setBestFriend(Person bestFriend) {
		this.bestFriend = bestFriend;
	}

}

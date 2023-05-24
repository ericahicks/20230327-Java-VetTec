package com.skillstom.training.day2.designpatterns;

/*
 * To make a singleton we need to do the following 3 steps:
 * 1. private static final instance
 * 2. private constructor
 * 3. public static getInstance() method
 */
public class SingletonExample {
	
	public static void main(String[] args) {
		Universe u = Universe.getInstance();
		System.out.println(u);

		Universe u2 = Universe.getInstance();
		System.out.println(u2);
		
		System.out.println(u == u2); // comparing the contents of the variables u and u2
		// same objects in memory are considered equal by the == operator
	}

}

class Universe {
	public static void main(String[] args) {
		Universe u = getInstance(); // inside Universe class, I do not need to specify Universe.
	}
	
	private int numSolarSystems;                             // to use lazy initialization:
	private static volatile Universe instance; // = new Universe(); // where can I do this instead?
	// atomic access = read and write must complete before another read can happen
	private Universe() { }
	
	public synchronized static Universe getInstance() {
		// only run new Universe once
		if (instance == null)
			instance = new Universe();
		return instance;
	}
	
	public int getNumSolarSystems() {
		return numSolarSystems;
	}

	public void add() {
		numSolarSystems++;
	}

	@Override
	public String toString() {
		return "Universe [numSolarSystems=" + numSolarSystems + "]";
	}
}
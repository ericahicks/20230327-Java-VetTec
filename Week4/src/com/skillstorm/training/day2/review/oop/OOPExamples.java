package com.skillstorm.training.day2.review.oop;

//////////////////////////////////////////////////////
//Which pillar of OOP does each example demonstrate?
public class OOPExamples {
////////////////////////////////////
// Example 1: Encapsulation
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

////////////////////////////////////
// Example 2: Polymorphism 
//    Method overloading
//    is compile time polymorphism
	public int random5StarRating() {
		return (int) (Math.random() * 5) + 1;
	}

	public int random5StarRating(int minScore) {
		int range = 5 - minScore;
		return (int) (Math.random() * range) + minScore;
	}

////////////////////////////////////
// Example 3: abstraction 
//    hiding implementation details
//    simplifying the user interface
//    
//    abstraction in particular abstract classes is to "throw ideas on a whiteboard"
//      creating something we are going to use later
//      this is an important design step for creating future classes
//    abstract classes are a piece of abstraction
//    
	public void makePbJ() {
		System.out.println("Here is your PbJ on " + procureBread() + " with "
				+ procureJelly() + " and " + procurePb());
	}
	
	// helper methods:
	private String procureBread() {
		return "whole wheat bread";
	}

	private String procureJelly() {
		return "strawberry jelly";
	}

	private String procurePb() {
		return "unsalted crunch pb";
	}

}

////////////////////////////////////////////////
//Example 4: abstraction
abstract class Poisonous {
	private int toxicity;

	public Poisonous() {
		super();
	}

	public Poisonous(int toxicity) {
		this.toxicity = toxicity;
	}

	public int getToxicity() {
		return toxicity;
	}

	public abstract void poison();
}

/////////////////////////////////////////////////
//Example 5: abstraction
interface Driveable {
	void drive();

	void stop();
}

////////////////////////////////////////////////
//Example 6:
class Car implements Driveable { // abstraction
	@Override              // polymorphism
	public void drive() {
		System.out.println("vroom vroom");
	}

	@Override
	public void stop() {
		System.out.println("screeeech");
	}
}

class Train implements Driveable { // abstraction
	@Override               // polymorphism
	public void drive() {
		System.out.println("chuga chuga choo choo");
	}
	@Override
	public void stop() {
		System.out.println("ScreeeEEEEeeech");
	}
}

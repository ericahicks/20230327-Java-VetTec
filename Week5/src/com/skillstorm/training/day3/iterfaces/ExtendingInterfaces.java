package com.skillstorm.training.day3.iterfaces;

public class ExtendingInterfaces {

}

interface Alive {
	void live();
	void die();
}

interface Animal extends Alive { // Interfaces can extend other interface BUT they cannot "implement" other interfaces
	void move();
}

//interface Alien implements Alive { // Interfaces cannot implement other interfaces but they can "extend" other interfaces
//	default void live() {System.out.println("weird"); }
//	default void die() {System.out.println("weird"); }
//}

interface Plant extends Alive {
	void photosynthesize();
}

//class DragonFly implements Animal {
//	
//}

/////////////////////////////////////////////////////
// Example 2: Doors can open close and some can lock
/////////////////////////////////////////////////////
interface Door {
	void open();
	void close();
}
interface LockedDoor extends Door {
	void lock();
	void unlock();
}
//class BarnDoor implements LockedDoor {
//	
//}
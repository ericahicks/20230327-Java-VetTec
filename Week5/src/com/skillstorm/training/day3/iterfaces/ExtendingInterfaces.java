package com.skillstorm.training.day3.iterfaces;

public class ExtendingInterfaces {

}

interface Alive {
	void live();
	void die();
}

interface Animal extends Alive {
	void move();
}

interface Plant extends Alive {
	void photosynthesize();
}

class DragonFly implements Animal {

	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
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
class BarnDoor implements LockedDoor {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		
	}
	
}
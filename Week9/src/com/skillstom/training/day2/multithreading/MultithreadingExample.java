package com.skillstom.training.day2.multithreading;
public class MultithreadingExample {
	
	public static void main(String[] args) throws InterruptedException {
		Universe u = Universe.getInstance();
		
		Thread t1 = new Thread(() -> System.out.println("t1"));
		t1.start();

		Thread t2 = new Thread(() -> System.out.println("t2"));
		t2.start();
		
		t1.join(); // this tells the main thread to wait for t1 before continueing
		t2.join();
		System.out.println("main");
		
		// TODO put in the chat what you get from printing
	}

}

class Universe {
	
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
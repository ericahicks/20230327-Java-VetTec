package com.skillstom.training.day2.multithreading;

public class MultithreadingExample {

	public static void main(String[] args) throws InterruptedException {
		Universe u = Universe.getInstance();

		Thread t1 = new Thread(() -> {
			System.out.println("t1");
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) { }
				u.add();
			}
		});

		Thread t2 = new Thread(() -> {
			System.out.println("t2");
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) { }
				u.add();
			}
		});
		t1.start();
		t2.start();

		t1.join(); // this tells the main thread to wait for t1 before continue
		t2.join();
		System.out.println("main done with " + u.getNumSolarSystems() + " solar systems");

		// TODO put in the chat what you get from printing
	}

}

/*
 * Add thread safety in one of three ways
 * 1. make the read and update methods synchronized, 
 *   so no one can read a value while someone else is updating it -- degrades performance
 * 1b. make the specific code statement(s) in the method that need to be thread-safe synchronized
 * 2. make the property being read/updated volatile so the most recent value is always read
 * 3. use an atomic data type for the property being read/updated
 *     Example: AtomicInteger in the java.util.concurrent.atomic package 
 */
class Universe {

	private int numSolarSystems; // to use lazy initialization:
	private volatile static Universe instance; // = new Universe(); // where can
												// I do this instead?
	// atomic access = read and write must complete before another read can
	// happen
	private static Object keyToTheUniverse = new Object(); // mutex acts like a lock
	                                                       // mutually exclusive access
	                                                       // only one thread can access at a time

	private Universe() {
	}

	public static Universe getInstance() {
		// only run new Universe once
		if (instance == null) {
			synchronized (keyToTheUniverse) { // uses mutex to decide if the block can run
			instance = new Universe();
			}
		}
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
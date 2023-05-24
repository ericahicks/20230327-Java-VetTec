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

class Universe {

	private int numSolarSystems; // to use lazy initialization:
	private volatile static Universe instance; // = new Universe(); // where can
												// I do this instead?
	// atomic access = read and write must complete before another read can
	// happen
	private static Object keyToTheUniverse = new Object(); // mutex acts like a lock

	private Universe() {
	}

	public static Universe getInstance() {
		// only run new Universe once
		if (instance == null) {
			synchronized (keyToTheUniverse) {
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
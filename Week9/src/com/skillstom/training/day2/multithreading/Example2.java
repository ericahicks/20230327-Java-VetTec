package com.skillstom.training.day2.multithreading;

public class Example2 {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			System.out.println("t1");
			for (int i = 0; i < 30; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		});

		Thread t2 = new Thread(() -> {
			System.out.println("t2");
			for (int i = 0; i < 20; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		});
		t1.start();
		t2.start();

		t1.join(); // this tells the main thread to wait for t1 before continue
		t2.join();
		System.out.println("main done");
	}

}

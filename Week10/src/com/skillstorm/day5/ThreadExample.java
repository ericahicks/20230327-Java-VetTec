package com.skillstorm.day5;

public class ThreadExample {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {throw new RuntimeException();});
		Thread t2 = new Thread(() -> {for (int i = 0; i < 10; i++) { System.out.println(i);}});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("continuing...");
		Thread t3 = new Thread(() -> {for (int i = 97; i < 124; i++) { System.out.println((char)i);}});
		t3.start();
		t3.join();
		System.out.println("End of main");
	}

}

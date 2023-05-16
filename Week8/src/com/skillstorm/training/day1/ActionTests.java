package com.skillstorm.training.day1;
import java.util.List;

public class ActionTests {
	
	static int x = 1;

	public static void delayed(Action a) throws InterruptedException { // 
		Thread.sleep(1000); // sleep for a 1000 milisecond
		a.act();
		Thread.sleep(1000); // sleep for a second
		a.act();
		Thread.sleep(1000); // sleep for a second
		a.act();
	}

	public static void main(String[] args) throws InterruptedException {
		String str = "not lunch yet";
		// Using the lambdas I wrote
		delayed(() -> System.out.println("Not doing anything"));
		delayed(() -> System.out.println("hi"));
		delayed(() -> System.out.println(str)); // notice the lambda has access to local variables where it is defined
		delayed(() -> System.out.println(x++));
		delayed(() -> System.out.println(x = x * 2));
		
		// Using the lambdas you wrote

	}

}

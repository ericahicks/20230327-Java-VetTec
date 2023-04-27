package com.skillstorm.training.day4;

import java.util.Random;

public class RandomExamples {
	
	
	public static void main(String[] args) {
		// Instead Math.random()
		////////////////////////////////////////////////////////////////////////////////////////////////
		// Example 1:
		// Create an instance of the Random class to use its helpful methods
		Random generator = new Random(); // different seeds give different sequences, this is done for us
//		Random generator = new Random(System.nanoTime()); // different seeds give different sequences
//		Random generator = new Random(123456789); // always the same sequence of values if the same seed
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		// Example 2: 
		//  Useful methods for getting a random int or random double
		System.out.println("Random int: " + generator.nextInt()); // -2billiion to +2billion
		System.out.println("Random double: " + generator.nextDouble()); // 0 to 1.0 exclusive

		///////////////////////////////////////////////////////////////////////////////////////////////
		// Example 3: There is no nextByte or nextShort but I can create one using the .next(int bits)
		//             Note: .next(int bits) is protected, so I cannot access it here, only from a subclass
		MyRandom mine = new MyRandom();
		System.out.println("Random byte: " + mine.nextByte());
		System.out.println("Random short: " + mine.nextShort());
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		// Example 4:
		// Generate an int a given range [inclusive, exclusive)
		System.out.println("=============Calling nextInt 100x=============");
		int i = 0;
		while (i++ < 100) {
//			System.out.println(generator.nextInt(10)); // range is 0 to 9
			System.out.println(generator.nextInt(10) + 1); // range is 1 to 10
		}
	
	}

}

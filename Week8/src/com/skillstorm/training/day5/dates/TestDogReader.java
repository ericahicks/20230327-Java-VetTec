package com.skillstorm.training.day5.dates;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class TestDogReader {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Dog d = new Dog("test", LocalDate.now());
		System.out.println(d);
		
		List<Dog> dogs = Dog.read(new File("src/com/skillstorm/training/day5/dates/dogs.csv"));
		System.out.println(dogs);
	}

}

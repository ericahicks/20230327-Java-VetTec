package com.skillstorm.training.day5.dates;

import java.time.*;
import java.time.format.*;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class Dog {
	String name;
	LocalDate dob;
	
	public Dog(String name, LocalDate date) {
		this.name = name;
		this.dob = date;
	}

	public static List<Dog> read(File file) throws FileNotFoundException, IOException {
		List<Dog> dogs = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			String s;
			while ((s = in.readLine()) != null) {
				// Split the string to get the name and date separately
				String[] fields = s.split(",");
				if (fields.length == 2) {
					String name = fields[0];
					String dob = fields[1]; // How can I parse the date 03-11-2019
					LocalDate date = null;
					try {
						date = LocalDate.parse(dob, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
					} catch (Exception e) {
						// just put null if date isn't parseable
					}
					dogs.add(new Dog(name, date));
				}
					
			}
		}
		
		return dogs;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", dob=" + dob + "]";
	}

}

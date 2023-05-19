package com.skillstorm.training.day4;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.io.*;

public class Challenge {
	// Create a custom Person class with a firstName, lastName, and dob (date of
	// birth)
	// write the data to a csv file

	// Bonus:
	// Read the data back from the file
	// Find the oldest person

	// Find the age range between the oldest and youngest person
	
	public static void main(String[] args) throws IOException {
		/////////////////////////////////////////////////////////////////////
		// Part 1: Creating person class
		// Testing person class
		Person p = new Person(null, null, null);
		Person p2 = new Person("John", "Doe", LocalDate.of(1970,  1, 1));
		System.out.println(p.csvFormat());
		System.out.println(p2.csvFormat());
		
		/////////////////////////////////////////////////////////////////////
		// Part 2: Saving to file
		File file = new File("src/com/skillstorm/training/day4/people.csv");
		
		// Testing saving to file
//		Person.save(Arrays.asList(p, p2), file);
		
		//////////////////////////////////////////////////////////////////////
		// Bonus 1: Reading from file
		Person p3 = Person.parse("Sean,Carter,2023-05-18");
		// Testing parsing String 
		System.out.println(p3);
		
		// Testing reading from file
		Person.read(file).forEach(System.out::println);
		
		//////////////////////////////////////////////////////////////////////
		// Bonus 2: Get oldest and youngest and age range
		// Testing getAge
		System.out.println(p2.getAge().getYears());

		// Get the oldest and youngest Person of a small list using list methods
		List<Person> lst = Arrays.asList(p2, p3);
		lst.sort(Comparator.comparing(Person::getDob));
		System.out.println(lst.get(0));
		lst.sort(Comparator.comparing(Person::getDob).reversed());
		System.out.println(lst.get(0));

		// Test getting the oldest person from a small list using stream methods
		Person oldest = 
				lst.stream()
				   .filter(x -> x.getDob() != null)
				   .sorted(Comparator.comparing(Person::getDob))
				   .findFirst().orElse(null);
		System.out.println(oldest);
		
		// Get the oldest person from a large file using stream methods
		oldest = 
				Person.read(file).stream()
				   .filter(x -> x.getDob() != null)
				   .sorted(Comparator.comparing(Person::getDob))
				   .findFirst().orElse(null);
		System.out.println(oldest);
		
		// Get the youngest person from a large file using stream methods
		Person youngest = 
				Person.read(file).stream()
				   .filter(x -> x.getDob() != null)
				   .sorted(Comparator.comparing(Person::getDob).reversed())
				   .findFirst().orElse(null);
		System.out.println(youngest);
		
		// Print out the age range
		System.out.println("Youngest is " + youngest.getAge().getYears() + " and oldest is " + oldest.getAge().getYears());
		
		Period range = Period.between(oldest.getDob(), youngest.getDob());
		System.out.println("Age range is " + range.getYears());
		
		// Getting range using .until method
		long ageGap = oldest.getDob().until(youngest.getDob(), ChronoUnit.YEARS);
		System.out.println("In other words, the age gap between the oldest and youngest is " + ageGap + " years");
	}

}

class Person {
	private String firstName;
	private String lastName;
	private LocalDate dob;

	public Person(String firstName, String lastName, LocalDate dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}
	
	public Period getAge() {
		return Period.between(dob, LocalDate.now());
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + "]";
	}
	
	public String csvFormat() {
		return firstName + "," + lastName + "," + dob;
	}
	
	public static void save(List<Person> people, File file) throws IOException {
		try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
			for (Person person : people) {
				out.write(person.csvFormat());
				out.newLine();
			}
		}
	}
	
	public static List<Person> read(File file) throws FileNotFoundException, IOException {
		List<Person> people = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {
			String s;
			// skip first row which is the column names
			s = in.readLine();
			while (s != null) {
				s = in.readLine();
				Person p = Person.parse(s);
				if (p != null)
					people.add(p);
			}
		}
		return people;
	}
	
	public static Person parse(String str) {
		if (str == null)
			return null;
		// Takes in a comma separated value list of the firstname,lastname,dob
		String[] fields = str.split(",");
		if (fields.length < 3)
			return null;
		LocalDate dob = null;
		try {
			dob = LocalDate.parse(fields[2]);
		} catch (DateTimeParseException e) {
			// skip parsing and just put null
		}
		return new Person(fields[0], fields[1], dob);
	}
	
	
	

}

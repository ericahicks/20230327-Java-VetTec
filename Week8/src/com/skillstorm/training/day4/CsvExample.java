package com.skillstorm.training.day4;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

// CSV = comma seperated values
public class CsvExample {

	public static void main(String[] args) throws IOException {
		// Let's write a list of objects to a CSV file
		List<Car> cars = new ArrayList<>();
		// TODO drop in the chat a year, make, model we can use to save to the csv file
		cars.add(new Car(2016, "Toyota", "Tacoma"));
		cars.add(new Car(2014, "Nissan", "sentra"));
		cars.add(new Car(2003, "Chevy", "camaro"));
		cars.add(new Car(1997, "Jeep", "Cherokee"));
		cars.add(new Car(2009, "Ford", "F150"));
		cars.add(new Car(2015, "Chevy", "equinox "));
		save(cars, new File("cars.csv"));
		
		// Let's read the data from a csv file and convert it to a list

	}
	
	public static void save(List<Car> cars, File file) throws IOException { // Path from java.nio is a newer version of File
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) { // append if file aleady exists
			for (Car car : cars) {
				writer.write(car.csvFormat());
				writer.newLine();
			}
			
		}
		
	}
	

}

// custom class of cars
class Car implements Serializable {
	private static final long serialVersionUID = 14738274879L; // if you refactor this class, update this
	
	private int year;
	private String make;
	private String model;
	public Car() {
		super();
	}
	public Car(int year, String make, String model) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year < 1900)
			throw new IllegalArgumentException("Year cannot be older than 1900");
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model
				+ "]";
	}
	
	public String csvFormat() {
		return year + ", " + make + ", " + model;
	}
	
}
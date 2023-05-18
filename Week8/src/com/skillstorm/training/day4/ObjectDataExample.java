package com.skillstorm.training.day4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectDataExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Let Java serialize your objects and save them to a .data file
//		List<Car> cars = new ArrayList<>();
//		cars.add(new Car(2016, "Toyota", "Tacoma"));
//		cars.add(new Car(2014, "Nissan", "sentra"));
//		cars.add(new Car(2003, "Chevy", "camaro"));
//		cars.add(new Car(1997, "Jeep", "Cherokee"));
//		cars.add(new Car(2009, "Ford", "F150"));
//		cars.add(new Car(2015, "Chevy", "equinox "));
//		save(cars, new File("cars.data")); // change to .data for saving the stream of bytes java created
		
		List<Car> cars = readData(new File("cars.data"));
		cars.forEach(System.out::println);
	}
	
	public static void save(List<Car> cars, File file) throws IOException { // Path from java.nio is a newer version of File
		try (ObjectOutputStream writer = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file, false)))) { // append if file aleady exists
			for (Car car : cars) {
				writer.writeObject(car);
			}
			
		}
		
	}
	
	public static List<Car> readData(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Not reading text so don't use Reader clas instead use InputStream
		List<Car> cars = new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			while (true) {
				Object obj = in.readObject();
				if (obj instanceof Car)
					cars.add((Car) obj);
			}
		} catch (EOFException e) {
			// end of file is reached
		}
		return cars;
	}

}

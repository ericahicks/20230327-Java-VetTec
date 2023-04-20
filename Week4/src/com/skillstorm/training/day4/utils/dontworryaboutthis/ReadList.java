package com.skillstorm.training.day4.utils.dontworryaboutthis;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadList {

	// For Testing purposes only
	public static void main(String[] args) {
		String path = "./src/com/skillstorm/training/day4/utils/dontworryaboutthis/fortune500list2022.csv";
		ArrayList<String> companies = readList(path);
		companies.stream().forEach(System.out::println);
	}
	
	// Utility method for retrieving the Fortune500 list from the csv file
	public static ArrayList<String>  getCompanies() {
		String path = "./src/com/skillstorm/training/day4/utils/dontworryaboutthis/fortune500list2022.csv";
		ArrayList<String> companies = readList(path);
		return companies;
	}
	
	// Utility method for reading the contents of a file into an ArrayList of Strings
	private static ArrayList<String> readList(String path) {
		// Create array to hold the contents of the file
		ArrayList<String> contents = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(path))) {
			// loop through the lines of the file
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				contents.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return contents;
	}

}

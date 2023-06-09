package com.skillstorm.training.day3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindLongestWords {
	
	public static void main(String[] args) throws IOException {
		String longest = "";
		// file located at root level words_alpha.txt
				try (BufferedReader in = new BufferedReader(
						new FileReader(new File("words_alpha.txt")));
						BufferedWriter out = new BufferedWriter(
								new FileWriter(new File("long_words.txt")))) {
					String s;
					while ((s = in.readLine()) != null) {
						if (s.length() > longest.length()) {
							longest = s;
						}
						if (s.length() > 27 ) {
							out.write(s);
							out.newLine();
						}
					}
				}
				System.out.println("longest is " + longest + " with " + longest.length() + " letters");
	}
	
	// TODO Challenge
	// Find the longest word in the words_alpha.txt
	
	// Problem 1:
	// How many letters does the longest word have?
	
	
	// Bonus 1:
	// What is the longest word? 
	
	
	// Bonus 2:
	// Write the longest word(s) to a file

}

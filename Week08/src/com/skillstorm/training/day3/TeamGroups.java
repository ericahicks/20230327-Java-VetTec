package com.skillstorm.training.day3;
import java.io.*;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
public class TeamGroups {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// put them in a list
		List<String> names = new LinkedList<>();
		// read in the names
		try (BufferedReader in = new BufferedReader(new FileReader(new File("names.txt")))) {
			String s;
			while ((s = in.readLine()) != null) {
				names.add(s);
			}
		}
		
		// use collections.shuffle
		Collections.shuffle(names);
		// print out the groups 
		// 3 groups of 2
		for (int i = 0; i < names.size(); i++) {
			// if the counter is odd, print a newline
			if (i % 2 == 1)
				System.out.println(names.get(i));
			else
				System.out.print(names.get(i) + " ");
		}
	}

}

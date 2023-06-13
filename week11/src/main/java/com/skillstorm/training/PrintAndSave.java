package com.skillstorm.training;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class PrintAndSave {
	
	public static void main(String[] args) throws IOException {
		// play
		play();
	
	}
	
	static void play() throws IOException {
		
		try (Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter( 
						new FileWriter("player.txt", true))) { // this would be based on their name
			out.println(LocalDateTime.now().toString());
			System.out.print("Would you like to play? (Y/N) ");
			out.print("Would you like to play? "); // in reality, don't bother writing to file unless they decide to play
			String answer = in.nextLine();
			out.println(answer);
			// logic
		
		}
	}

}

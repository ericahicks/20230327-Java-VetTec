package com.skillstorm.training.day2;

import java.util.Scanner;

public class ScannerPractice {
	
	public static void main(String[] args) {
		// Scanners are a resource that need to be closed
		
		Scanner in = new Scanner(System.in);
		in.nextLine();
		
		in.close();
	}

}

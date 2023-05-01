package com.skillstorm.day1;

import java.util.ArrayList;

public class QuizReview {

	public static void main(String[] args) {
		int x = 10;
		int y = x++;
		System.out.println(x + "," + y);
		
		ArrayList<String> musicians = new ArrayList<>();
	      musicians.add("Johnny Cash");
	      musicians.add("Marty Robbins");
	      musicians.add("Merle Haggard");
	      musicians.add("Buck Owens");
	      
	      for (int i = musicians.size() - 1; i >= 0; i--) {
	         if (i % 2 == 0)
	            continue;
	         musicians.remove(i);
	      }
	      System.out.println(musicians);

	}

}

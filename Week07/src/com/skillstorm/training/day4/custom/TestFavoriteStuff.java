package com.skillstorm.training.day4.custom;

import java.util.PriorityQueue;

public class TestFavoriteStuff {
	
	public static void main(String[] args) {
		PriorityQueue<FavoriteStuff> myFavoriteStuff =
				new PriorityQueue<>();
		
		myFavoriteStuff.add(new FavoriteStuff("vaccuum", 3, 3));
		myFavoriteStuff.add(new FavoriteStuff("vaccuum2", 3, 3));
		myFavoriteStuff.add(new FavoriteStuff("bicycle", 4, 1));
		myFavoriteStuff.add(new FavoriteStuff("bicycle", 4, 3));
//		System.out.println(myFavoriteStuff);
		
		while (!myFavoriteStuff.isEmpty()) {
			System.out.println(myFavoriteStuff.poll());
		}
	}

}

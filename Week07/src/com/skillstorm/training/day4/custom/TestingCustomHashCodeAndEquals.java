package com.skillstorm.training.day4.custom;

import java.util.HashSet;

public class TestingCustomHashCodeAndEquals {
	public static void main(String[] args) {
		FavoriteStuff item1 = new FavoriteStuff("computer", 3, 2);
		FavoriteStuff item2 = new FavoriteStuff("coffee cup", 4, 12);
		FavoriteStuff item3 = new FavoriteStuff("book", 5, 6);
		FavoriteStuff item4 = new FavoriteStuff("book", 5, 10);
		HashSet<FavoriteStuff> stuff = new HashSet<>();
		stuff.add(item1);
		stuff.add(item2);
		stuff.add(item3);
		stuff.add(item4);
		System.out.println(stuff);
	}
}

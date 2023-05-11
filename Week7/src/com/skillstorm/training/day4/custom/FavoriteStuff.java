package com.skillstorm.training.day4.custom;

public class FavoriteStuff implements Comparable<FavoriteStuff>{
	
	String name;
	int ranking; // star rating out of 5
	int age; // in years

	
	public FavoriteStuff(String name, int ranking, int age) {
		this.name = name;
		this.ranking = ranking;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + String.format("(%d stars, %d years old)", ranking, age);
	}

	// returns negative if this ranking is higher (or if equal age lower)
	// returns zero if this ranking is equal (and age is equal)
	// returns positive if this ranking is lower (or if equal age higher)
	@Override
	public int compareTo(FavoriteStuff o) {
		if (this.ranking > o.ranking) {
			return -1; // negative because better
		} else if (this.ranking == o.ranking) {
			return this.age - o.age; // new is better so 1yr - 3yr
		} else {
			return 1; // positive because worse
		}
	}
}

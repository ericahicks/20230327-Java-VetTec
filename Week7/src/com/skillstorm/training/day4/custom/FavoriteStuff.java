package com.skillstorm.training.day4.custom;

import java.util.Objects;

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
	
	@Override
	public int hashCode() {
		int prime = 29; 
		// include a numeric value of the fields that equals compares
		int hash = 1;
		hash = hash * prime + ranking;
		hash = hash * prime + Objects.hashCode(name); // Objects.hashCode(object) is null safe so won't throw exception
		hash = hash * prime + age;
		return hash;
	}
	
	@Override
	public boolean equals(Object other) {
		// equals and hashcode must look at the same fields
		if (other == null) {
			return false;
		}
		// check if same type
		if (!(other instanceof FavoriteStuff))
			return false;
		// convert to that type
		FavoriteStuff stuff = (FavoriteStuff) other;
		// compare the name and rank and the age
		if (this.ranking != stuff.ranking)
			return false;
		if (stuff.name == null && this.name != null)
			return false;
		if (!stuff.name.equals(this.name))
			return false;
		if (this.age != stuff.age)
			return false;
		// code gets here everything matched
		return true; 
	}
}

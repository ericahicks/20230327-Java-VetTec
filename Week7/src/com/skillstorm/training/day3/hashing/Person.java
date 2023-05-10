package com.skillstorm.training.day3.hashing;

import java.util.Objects;

public class Person {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Erica";
		System.out.println(p.hashCode());
		

		Person p2 = new Person();
		p2.name = "Anna";
		System.out.println(p2.hashCode());
	}
	
	String name;
	int age;
	@Override
	public int hashCode() {
		// Before we took 1-letter and took the numeric value
		int hash = name.toLowerCase().charAt(0) - 97 + 1;
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}

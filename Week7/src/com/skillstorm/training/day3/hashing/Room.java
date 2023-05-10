package com.skillstorm.training.day3.hashing;

public class Room {
	
	String name;
	String description;
	int size; //sqr ft
	int height;
	boolean locked;
	Furniture[] furniture;
	Color color;
	
	@Override
	public int hashCode() {
		// Add the hashcodes of all the fields
		// but multiply by a large prime number in between
		final int prime = 31; 
		int hash = 1;
		hash = prime * hash
				+ ((description == null) ? 0 : description.hashCode());
		hash = prime * hash + ((name == null) ? 0 : name.hashCode());
		hash = prime * hash + size;
		hash = prime * hash + height;
		hash = prime * hash + Boolean.hashCode(locked);
		hash = prime * hash + color.hashCode();
		hash = prime * hash + furniture.hashCode();
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
		Room other = (Room) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Color {
	
}

class Furniture {
	
}

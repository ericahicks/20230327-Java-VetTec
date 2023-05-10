package com.skillstorm.training.day3.hashing;

import java.util.Arrays;
import java.util.Objects;

public class Room {
	
	String name;
	String description;
	int size; //sqr ft
	int height;
	boolean locked;
	Furniture[] furniture;
	Color color;
	
	// Our implementation: 
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
		hash = prime * hash + ((color == null) ? 0 : color.hashCode());
		hash = prime * hash + ((furniture == null) ? 0 :Arrays.hashCode(furniture));
		return hash;
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	// IDE generated implementation
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((color == null) ? 0 : color.hashCode());
//		result = prime * result
//				+ ((description == null) ? 0 : description.hashCode());
//		result = prime * result + Arrays.hashCode(furniture);
//		result = prime * result + height;
//		result = prime * result + (locked ? 1231 : 1237);
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + size;
//		return result;
//	}
//
//	// Simpler IDE generated hashCode adn equals using built-in methods
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Room other = (Room) obj;
//		if (color == null) {
//			if (other.color != null)
//				return false;
//		} else if (!color.equals(other.color))
//			return false;
//		if (description == null) {
//			if (other.description != null)
//				return false;
//		} else if (!description.equals(other.description))
//			return false;
//		if (!Arrays.equals(furniture, other.furniture))
//			return false;
//		if (height != other.height)
//			return false;
//		if (locked != other.locked)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (size != other.size)
//			return false;
//		return true;
//	}
//////////////////////////////////////////////////////////////////////////////////
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + Arrays.hashCode(furniture);
//		result = prime * result
//				+ Objects.hash(color, description, height, locked, name, size);
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Room other = (Room) obj;
//		return Objects.equals(color, other.color)
//				&& Objects.equals(description, other.description)
//				&& Arrays.equals(furniture, other.furniture)
//				&& height == other.height && locked == other.locked
//				&& Objects.equals(name, other.name) && size == other.size;
//	}
//////////////////////////////////////////////////////////////////////////////
}

class Color {
	// Inherits .hashCode() method from Object class (converts memory address into 32bit int)
}

class Furniture {
	// Inherits .hashCode() method from Object class (converts memory address into 32bit int)
}

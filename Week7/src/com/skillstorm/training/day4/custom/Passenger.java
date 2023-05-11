package com.skillstorm.training.day4.custom;

public class Passenger {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + group;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Passenger other = (Passenger) obj;
		if (group != other.group) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	String name;
	int group;
	
	public Passenger(String name, int group) {
		this.name = name;
		this.group = group;
	}
	
	@Override
	public String toString() {
		return group + " " + name;
	}
}

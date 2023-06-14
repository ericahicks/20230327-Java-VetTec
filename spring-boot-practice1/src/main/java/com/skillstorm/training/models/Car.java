package com.skillstorm.training.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	private long id;
	
	private String vin;
	
	private String make;
	
	private String model;
	
	private int year;
	
	public Car() { }

	public void setId(long id) {
		this.id = id;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getId() {
		return id;
	}

	public String getVin() {
		return vin;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", vin=" + vin + ", make=" + make + ", model="
				+ model + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, make, model, vin, year);
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
		Car other = (Car) obj;
		return id == other.id && Objects.equals(make, other.make)
				&& Objects.equals(model, other.model)
				&& Objects.equals(vin, other.vin) && year == other.year;
	}
	
}

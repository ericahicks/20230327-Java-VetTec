package com.skillstorm.training.models;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

@Entity
public class City {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "city_id")
	private short id;

	@Column(length = 50)
	private String city;
	
	@UpdateTimestamp
	private Instant lastUpdated;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	@JsonIdentityReference(alwaysAsId = true)
	private Country country;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Instant getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Instant lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", city=" + city + ", lastUpdated="
				+ lastUpdated + ", country=" + country.getCountry() + "]";
	}

}

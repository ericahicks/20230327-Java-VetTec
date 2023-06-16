package com.skillstorm.training.models;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private short id;

	@Column(length = 50)
	private String country;
	
	@UpdateTimestamp
	private Instant lastUpdated;
	
	@OneToMany(mappedBy = "country")
	private Set<City> cities; 

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Instant getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Instant lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", country=" + country + ", lastUpdated="
				+ lastUpdated + "]";
	}
	
}

package com.skillstorm.training.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//This is the owner side of our one-to-many
//one-to-many
//owner
//one-directional or bi-directional relationship
//here both sides of the one-to-many keep track of eachother

@Entity
@Table(name = "makes")
public class CarMake {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "make_id")
	private long id;

	@Column(length = 45)
	private String countryOfOrigin;
	
	@Column(length = 45)
	private String make;
	
	@OneToMany(mappedBy = "make") // this is the java property name
	private Set<CarModel> models;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
}

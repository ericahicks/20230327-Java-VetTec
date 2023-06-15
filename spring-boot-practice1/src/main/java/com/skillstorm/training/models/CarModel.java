package com.skillstorm.training.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


// models have one make they are associated with
@Entity
@Table(name = "models")
public class CarModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 45)
	private String model;
	
	// makes have many models
	// so here our model class keeps track of 
	// the corresponding CarMake
	@ManyToOne
	@JoinColumn(name = "make_id") // column name
	private CarMake make;

	public long getId() {
		return id;
	}

	public String getModel() {
		return model;
	}

	public CarMake getMake() {
		return make;
	}
	
}

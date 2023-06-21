package com.skillstorm.training.models;

import java.time.Instant;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;

@Entity
@Table(name = "actors")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	short id;
	
	@Column(length = 45)
	String firstName;
	
	@Column(length = 45)
	String lastName;
	
	@UpdateTimestamp
	Instant lastUpdate;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "actor_id", orphanRemoval = true)
	List<FilmActor> filmActor;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<FilmActor> getFilmActor() {
		return filmActor;
	}

	public void setFilmActor(List<FilmActor> filmActor) {
		this.filmActor = filmActor;
	}
	

}

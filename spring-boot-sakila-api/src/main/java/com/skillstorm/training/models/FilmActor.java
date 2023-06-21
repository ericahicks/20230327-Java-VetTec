package com.skillstorm.training.models;

import java.time.Instant;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "film_actor")
public class FilmActor {
	
	@EmbeddedId
	private CompositeKeyFilmActor id;
	
	@UpdateTimestamp
	Instant lastUpdate;

	public CompositeKeyFilmActor getId() {
		return id;
	}

	public void setId(CompositeKeyFilmActor id) {
		this.id = id;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
}
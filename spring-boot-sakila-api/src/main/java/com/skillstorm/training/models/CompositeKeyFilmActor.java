package com.skillstorm.training.models;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CompositeKeyFilmActor {
	
	@ManyToOne
	@JoinColumn(name = "actor_id")
	private Actor actor;
	
	@ManyToOne
	@JoinColumn(name = "film_id")
	private Film film;

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}
	

}

package com.skillstorm.training.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class TextBook {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "textbook_id")
	private int id;
	
	private String title;
	

	@ManyToMany
	@JoinTable(name = "author_textbook",
				joinColumns = @JoinColumn(name = "textbook_id"),
				inverseJoinColumns = @JoinColumn(name = "author_id"))
//	@Cascade({CascadeType.})
	private Set<Author> authors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + id + ", title=" + title + ", authors="
				+ authors + "]";
	}
	
}

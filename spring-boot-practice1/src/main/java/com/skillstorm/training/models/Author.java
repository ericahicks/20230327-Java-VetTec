package com.skillstorm.training.models;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id")
	private int id;
	
	private String name;
	
	@UpdateTimestamp
	private Instant lastUpdatedOn;
	                                      // FetchType.EAGER is not great for performance
	@ManyToMany(mappedBy = "authors", fetch = FetchType.LAZY) // don't grab these inner objects from the database unless I ask  for  it
//	@Cascade({CascadeType.PERSIST, CascadeType.SAVE_UPDATE, CascadeType.MERGE})
	@JsonIgnore
	private Set<TextBook> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<TextBook> getBooks() {
		return books;
	}

	public void setBooks(Set<TextBook> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	
}

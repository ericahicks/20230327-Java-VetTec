package com.skillstorm.training.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "books")
public class Book {
	@Transient
	Logger logger = LoggerFactory.getLogger(getClass());
	
	// Must exactly match my table
	@Id
	private String isbn;
	
	@NotNull
	@NotBlank
	private String authorFirstName;
	@NotNull
	@NotBlank
	private String authorLastName;
	@NotNull
	@NotBlank
	private String title;
	
	private String genre;
	
	// TODO don't hardcode this
	@Max(value = 2023, message = "Year must be in the past or present not future.") 
	private int year;
	// Make sure you have
	// - getters/setters
	// - constructor
	// - toString
	// (optional: equals and hashCode) we may not use today but good to have around
	public Book() {
		logger.debug("creating book");
		this.title = "unknown";
	}
	
	public Book(String isbn, String authorFirstName, String authorLastName,
			String title, String genre, int year) {
		super();

		logger.debug("creating book:" + "[isbn=" + isbn + ", authorFirstName=" + authorFirstName
				+ ", authorLastName=" + authorLastName + ", title=" + title
				+ ", genre=" + genre + ", year=" + year + "]");
		this.isbn = isbn;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", authorFirstName=" + authorFirstName
				+ ", authorLastName=" + authorLastName + ", title=" + title
				+ ", genre=" + genre + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorFirstName, authorLastName, genre, isbn, title,
				year);
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
		Book other = (Book) obj;
		return Objects.equals(authorFirstName, other.authorFirstName)
				&& Objects.equals(authorLastName, other.authorLastName)
				&& Objects.equals(genre, other.genre)
				&& Objects.equals(isbn, other.isbn)
				&& Objects.equals(title, other.title) && year == other.year;
	}

}

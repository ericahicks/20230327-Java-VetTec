package com.skillstorm.models;

import java.util.Objects;

public class Book {
	// Must exactly match my table
	private String isbn;
	private String authorFirstName;
	private String authorLastName;
	private String title;
	private String genre;
	private int year;
	// Make sure you have
	// - getters/setters
	// - constructor
	// - toString
	// (optional: equals and hashCode) we may not use today but good to have around
	
	public Book(String isbn, String authorFirstName, String authorLastName,
			String title, String genre, int year) {
		super();
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

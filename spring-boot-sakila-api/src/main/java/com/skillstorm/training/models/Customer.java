package com.skillstorm.training.models;

import java.time.Instant;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Customer {
	
	/*
	 * 1. To use validations, make sure you have the validation dependency in your pom
	 * 2. Add annotations to the properties you want to validate
	 * 3. In the controller, whenever you have a parameter of this type annotate it with @Valid
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private short id;
	
	@Column(length = 45)
	@NotNull
	@NotBlank
	private String firstName;
	
	@Column(length = 45)
	private String lastName;
	
	@Column(length = 50)
	@Email
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
	private Address address;
	
	@Past
	@NotNull
	private LocalDate dob;
	
	private boolean active;
	
	@CreationTimestamp
	@Column(name = "create_date")
	private Instant creationDate;
	
	@UpdateTimestamp
	private Instant lastUpdate;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Instant getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Instant creationDate) {
		this.creationDate = creationDate;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", address=" + address
				+ ", active=" + active + ", creationDate=" + creationDate
				+ ", lastUpdate=" + lastUpdate + "]";
	}
	
}

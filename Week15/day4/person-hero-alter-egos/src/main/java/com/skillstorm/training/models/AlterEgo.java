package com.skillstorm.training.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// JPA annotation
@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class AlterEgo {

	// properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String superpowers;

	private String weakness;

	// Set up the one-to-one relationship between Person and AlterEgo
	@OneToOne(mappedBy = "alterEgo", cascade = CascadeType.ALL, orphanRemoval = true)
//	@JsonBackReference 
//	@JsonIgnore
	@JsonIdentityReference(alwaysAsId = true)
	Person person;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperpowers() {
		return superpowers;
	}

	public void setSuperpowers(String superpowers) {
		this.superpowers = superpowers;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	public void addSuperpower(String superpower) {
		if (this.superpowers == null || this.superpowers.isEmpty())
			this.superpowers = superpower;
		else
			this.superpowers += ", " + superpower;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "AlterEgo [id=" + id + ", name=" + name + ", superpowers="
				+ superpowers + ", weakness=" + weakness + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		AlterEgo other = (AlterEgo) obj;
		return Objects.equals(id, other.id);
	}

}

package com.skillstorm.training.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// JPA annotation
@Entity
public class AlterEgo {
	
	// properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String name;
	
	private List<String> superpowers; // what does this default to? null
	
	private String weakness;
	
	// Set up the one-to-one relationship between Person and AlterEgo
	@OneToOne(mappedBy = "", cascade = "", orphanRemoval = "") 
	Person person; 
	
	public AlterEgo() {
		this.superpowers = new ArrayList<>();
	}

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

	public List<String> getSuperpowers() {
		return superpowers;
	}

	public void setSuperpowers(List<String> superpowers) {
		this.superpowers = superpowers;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
	
	public void addSuperpower(String superpower) {
		this.superpowers.add(superpower);
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

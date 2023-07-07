package com.skillstorm.training.models;

import java.util.Objects;

/* Options for getting rid of the circular reference when serializing the object
 *  (Here owner = the class that "owns"/"manages" the relationship and has the primary key in its table)
 * - @JsonIgnore on the non-owning class's owner-type property
 * - @JsonManagedReference on the non-owning class's parent property (AlterEgo's Person person property)
 *     and 
 *   @JsonBackReference on the parent class's child property (Person's AlterEgo alterEgo property)
 *   NOTE: owning class = the class with the @JoinColumn annotation
 *         non-owning class = the class with the (mappedBy = " ") annotation information
 * - @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
 *
 */


/* Default fetch type for different JPA relationships
	OneToMany: LAZY
	ManyToOne: EAGER
	ManyToMany: LAZY
	OneToOne: EAGER
*/

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// This is the "owning" side of the one-to-one relationship with alter-ego
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Person {
	//////////////////////////////////////////////////////////////////////////
	// Properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String job;

	// Set up the one-to-one relationship between Person and AlterEgo
	// -- this is the owning side
	// -- on the other side I'll put the (mappedBy = "")
	@OneToOne// (fetch = FetchType.LAZY)
	@JoinColumn(name = "alter_ego_id", referencedColumnName = "id")
//	@JsonBackReference
	private AlterEgo alterEgo; // this property name is used in the mappedBy = ""
								// on the other class of this mapping
	
	////////////////////////////////////////////////////////////////
	// Getters and Setters
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public AlterEgo getAlterEgo() {
		return alterEgo;
	}

	public void setAlterEgo(AlterEgo alterEgo) {
		this.alterEgo = alterEgo;
	}
	
	////////////////////////////////////////////////////////////////////////
	// Methods

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", job=" + job + "]";
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
		Person other = (Person) obj;
		return Objects.equals(id, other.id);
	}

}

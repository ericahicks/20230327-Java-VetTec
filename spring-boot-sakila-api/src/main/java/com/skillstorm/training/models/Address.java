package com.skillstorm.training.models;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private short id;
	
	@Column(length = 50)
	private String address;
	
	@Column(length = 50)
	private String address2;
	
	@Column(length = 20)
	private String district;
	
	// UNIDIRECTIONAL so there is no corresponding @OneToMany in the City class
	// https://en.wikibooks.org/wiki/Java_Persistence/OneToMany#Undirectional_OneToMany.2C_No_Inverse_ManyToOne.2C_No_Join_Table_.28JPA_2.0_ONLY.29
	@ManyToOne 
	@JoinColumn(name = "city_id", referencedColumnName = "city_id")
	private City city;
	
	@Column(length = 10)
	private String postalCode;
	
	@Column(length = 20)
	private String phone;
	
	@UpdateTimestamp
	private Instant lastUpdate;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", address2="
				+ address2 + ", district=" + district + ", city=" + city.getId()
				+ ", postalCode=" + postalCode + ", phone=" + phone
				+ ", lastUpdate=" + lastUpdate + "]";
	}
	
}

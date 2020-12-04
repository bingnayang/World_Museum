package com.museum.worldmuseumbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="museum")
public class Museum {
	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private int name;
	
	@Column(name="address")
	private int address;
	
	@Column(name="country")
	private int country;
	
	@Column(name="website")
	private int website;
	
	@Column(name="imageLink")
	private int imageLink;
	
	// Define Constructors
	public Museum() {}

	public Museum(int name, int address, int country, int website, int imageLink) {
		this.name = name;
		this.address = address;
		this.country = country;
		this.website = website;
		this.imageLink = imageLink;
	}

	// Define Getter/Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public int getWebsite() {
		return website;
	}

	public void setWebsite(int website) {
		this.website = website;
	}

	public int getImageLink() {
		return imageLink;
	}

	public void setImageLink(int imageLink) {
		this.imageLink = imageLink;
	}
	
	
	

}

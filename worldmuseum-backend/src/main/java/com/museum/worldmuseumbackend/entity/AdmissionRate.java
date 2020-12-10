package com.museum.worldmuseumbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admission_rates")
public class AdmissionRate {
	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="museum_id")
	private int museum_id;
	
	@Column(name="guest")
	private String guest;
	
	@Column(name="price") 
	private String price;
	
	public AdmissionRate() {}
	
	public AdmissionRate(int museum_id, String guest, String price) {
		this.museum_id = museum_id;
		this.guest = guest;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getMuseum_id() {
		return museum_id;
	}

	public void setMuseum_id(int museum_id) {
		this.museum_id = museum_id;
	}
	
}

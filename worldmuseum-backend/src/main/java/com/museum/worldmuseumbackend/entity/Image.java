package com.museum.worldmuseumbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="images")
public class Image {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="museum_id")
	private int museum_id;
	
	@Column(name="image")
	private String image;
	
	@Column(name="date")
	private String date;

	public Image() {}
	
	public Image(int museum_id, String image, String date) {
		this.museum_id = museum_id;
		this.image = image;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMuseum_id() {
		return museum_id;
	}

	public void setMuseum_id(int museum_id) {
		this.museum_id = museum_id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}

package com.museum.worldmuseumbackend.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="museum")
public class Museum {
	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="museum_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="country")
	private String country;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="website")
	private String website;
	
	@Column(name="image_link")
	private String image_link;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="museum_Id")
	private List<Hour> hours;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="museum_Id")
	private List<AdmissionRate> admissionRate;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="museum_Id")
	private List<Comment> comments;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="museum_Id")
	private List<Image> images;
	
	// Define Constructors
	public Museum() {}

	public Museum(String name, String address, String country, String website, String phone, String image_link) {
		this.name = name;
		this.address = address;
		this.country = country;
		this.website = website;
		this.phone = phone;
		this.image_link = image_link;
	}

	// Define Getter/Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getImage_link() {
		return image_link;
	}

	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public List<Hour> getHours() {
		return hours;
	}

	public void setHours(List<Hour> hours) {
		this.hours = hours;
	}
	
	public List<AdmissionRate> getAdmissionRate() {
		return admissionRate;
	}

	public void setAdmissionRate(List<AdmissionRate> admissionRate) {
		this.admissionRate = admissionRate;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	// Add a convenience method
	public void addHour(Hour theHour) {
		if(hours == null) {
			hours = new ArrayList<>();
		}
		hours.add(theHour);
	}
	public void addAdmissionRate(AdmissionRate theAdmissionRate) {
		if(admissionRate == null) {
			admissionRate = new ArrayList<>();
		}
		admissionRate.add(theAdmissionRate);
	}
	public void addComment(Comment theComment) {
		if(comments == null) {
			comments = new ArrayList<>();
		}
		comments.add(theComment);
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}
	
}

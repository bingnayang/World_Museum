package com.museum.worldmuseumbackend.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hours")
public class Hour {
	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="museum_id")
	private int museum_id;
	
	@Column(name="day")
	private String day;
	
	@Column(name="hour")
	private String hour;
		
	public Hour() {
		
	}

	public Hour(int museum_id, String day, String hour) {
		this.museum_id = museum_id;
		this.day = day;
		this.hour = hour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public int getMuseum_id() {
		return museum_id;
	}

	public void setMuseum_id(int museum_id) {
		this.museum_id = museum_id;
	}
	
}

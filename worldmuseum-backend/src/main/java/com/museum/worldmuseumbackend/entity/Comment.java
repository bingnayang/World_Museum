package com.museum.worldmuseumbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="museum_id")
	private int museum_id;
	
	@Column(name="comment")
	private String comment;
	
	public Comment() {}

	public Comment(int museum_id, String comment) {
		this.museum_id = museum_id;
		this.comment = comment;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}

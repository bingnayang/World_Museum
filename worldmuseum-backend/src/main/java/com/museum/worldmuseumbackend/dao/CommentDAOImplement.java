package com.museum.worldmuseumbackend.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDAOImplement implements CommentDAO {
	// Define field for entitymanager
	private EntityManager entityManager;
	
	// Set up constructor injection
	@Autowired
	public CommentDAOImplement(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
}

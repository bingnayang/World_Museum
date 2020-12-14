package com.museum.worldmuseumbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.museum.worldmuseumbackend.entity.Comment;
import com.museum.worldmuseumbackend.entity.Hour;

@Repository
public class CommentDAOImplement implements CommentDAO {
	// Define field for entitymanager
	private EntityManager entityManager;
	
	// Set up constructor injection
	@Autowired
	public CommentDAOImplement(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Comment> findByMuseumId(int museumId) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		// Using native Hibernate API
		Query<Comment> theQuery = currentSession.createQuery("from Comment where museum_id=:museum_id",Comment.class);
		theQuery.setParameter("museum_id",museumId);
		
		// Execute query and get result list
		List<Comment> comments = theQuery.getResultList();
		
		// Return the result
		return comments;
	}

	@Override
	public void save(Comment theComment) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Save rates
		currentSession.saveOrUpdate(theComment);
		
	}
	
	
}

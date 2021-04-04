package com.museum.worldmuseumbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.museum.worldmuseumbackend.entity.Image;

@Repository
public class ImageDAOImplement implements ImageDAO {
	// Define field for entitymanager
	private EntityManager entityManager;
	
	// Set up constructor injection
	@Autowired
	public ImageDAOImplement(EntityManager theEntityManager){
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Image> findByMuseumId(int museumId) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		// Using native Hibernate API
		Query<Image> theQuery = currentSession.createQuery("from Image where museum_id=:museum_id",Image.class);
		theQuery.setParameter("museum_id",museumId);
		
		// Execute query and get result list
		List<Image> images = theQuery.getResultList();
		
		// Return the result
		return images;
	}

	@Override
	public void save(Image theImage) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Save rates
		currentSession.saveOrUpdate(theImage);
	}

}

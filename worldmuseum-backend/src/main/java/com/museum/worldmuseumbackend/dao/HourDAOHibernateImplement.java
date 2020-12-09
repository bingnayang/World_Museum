package com.museum.worldmuseumbackend.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.museum.worldmuseumbackend.entity.Hour;

public class HourDAOHibernateImplement implements HourDAO {
	// Define field for entitymanager
	private EntityManager entityManager;
	
	// Set up constructor injection
	@Autowired
	public HourDAOHibernateImplement(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public void save(Hour theHour) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Save museum
		currentSession.saveOrUpdate(theHour);

	}

}

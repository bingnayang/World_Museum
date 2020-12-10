package com.museum.worldmuseumbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.museum.worldmuseumbackend.entity.Hour;
import com.museum.worldmuseumbackend.entity.Museum;

@Repository
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

	@Override
	public List<Hour> findAll() {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		// Using native Hibernate API
		Query<Hour> theQuery = currentSession.createQuery("from Hour",Hour.class);
		
		// Execute query and get result list
		List<Hour> hours = theQuery.getResultList();
		
		// Return the result
		return hours;
	}

	@Override
	public List<Hour> findByMuseumId(int museumId) {		
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		// Using native Hibernate API
		Query<Hour> theQuery = currentSession.createQuery("from Hour where museum_id=:museum_id",Hour.class);
		theQuery.setParameter("museum_id",museumId);
		
		// Execute query and get result list
		List<Hour> hours = theQuery.getResultList();
		
		// Return the result
		return hours;
	}

}

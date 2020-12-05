package com.museum.worldmuseumbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.museum.worldmuseumbackend.entity.Museum;

@Repository
public class MuseumDAOHibernateImplement implements MuseumDAO {
	// Define field for entitymanager
	private EntityManager entityManager;
	
	// Set up constructor injection
	@Autowired
	public MuseumDAOHibernateImplement(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	public List<Museum> findAll() {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		// Using native Hibernate API
		Query<Museum> theQuery = currentSession.createQuery("from Museum",Museum.class);
		
		// Execute query and get result list
		List<Museum> museums = theQuery.getResultList();
		
		// Return the result
		return museums;
		
	}

	@Override
	public void save(Museum theMuseum) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Save museum
		currentSession.saveOrUpdate(theMuseum);
		
	}

	@Override
	public void deleteById(int id) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Delete object with id
		Query theQuery = currentSession.createQuery("delete from Museum where id=:museumId");
		theQuery.setParameter("museumId",id);
		theQuery.executeUpdate();
		
	}

	@Override
	public Museum findById(int id) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Get the museum
		Museum theMuseum = currentSession.get(Museum.class, id);
		
		// Return the museum
		return theMuseum;
	}

}

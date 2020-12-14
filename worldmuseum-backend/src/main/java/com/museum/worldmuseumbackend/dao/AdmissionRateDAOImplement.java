package com.museum.worldmuseumbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.museum.worldmuseumbackend.entity.AdmissionRate;
import com.museum.worldmuseumbackend.entity.Hour;

@Repository
public class AdmissionRateDAOImplement implements AdmissionRateDAO {

	// Define field for entitymanager
	private EntityManager entityManager;
	
	public AdmissionRateDAOImplement(EntityManager theEntityManager){
		entityManager = theEntityManager;
	}

	@Override
	public void save(AdmissionRate theRate) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Save rates
		currentSession.saveOrUpdate(theRate);
	}

	@Override
	public List<AdmissionRate> findByMuseumId(int museumId) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		// Using native Hibernate API
		Query<AdmissionRate> theQuery = currentSession.createQuery("from AdmissionRate where museum_id=:museum_id",AdmissionRate.class);
		theQuery.setParameter("museum_id",museumId);
		
		// Execute query and get result list
		List<AdmissionRate> rates = theQuery.getResultList();
		
		// Return the result
		return rates;
	}
	
}

package com.museum.worldmuseumbackend.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.museum.worldmuseumbackend.entity.AdmissionRate;

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
	
}

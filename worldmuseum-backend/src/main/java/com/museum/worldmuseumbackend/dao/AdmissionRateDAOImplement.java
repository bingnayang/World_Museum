package com.museum.worldmuseumbackend.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@Repository
public class AdmissionRateDAOImplement implements AdmissionRateDAO {

	// Define field for entitymanager
	private EntityManager entityManager;
	
	public AdmissionRateDAOImplement(EntityManager theEntityManager){
		entityManager = theEntityManager;
	}
	
}

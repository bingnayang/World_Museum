package com.museum.worldmuseumbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.museum.worldmuseumbackend.dao.AdmissionRateDAO;
import com.museum.worldmuseumbackend.entity.AdmissionRate;

@Service
public class AdmissionRateServiceImplement implements AdmissionRateService {
	private AdmissionRateDAO rateDAO;
	
	@Autowired
	public AdmissionRateServiceImplement(AdmissionRateDAO theRate) {
		rateDAO = theRate;
	}

	@Override
	@Transactional
	public void save(AdmissionRate theRate) {
		rateDAO.save(theRate);
	}

	@Override
	@Transactional
	public List<AdmissionRate> findByMuseumId(int museumId) {
		return rateDAO.findByMuseumId(museumId);
	}
	
}

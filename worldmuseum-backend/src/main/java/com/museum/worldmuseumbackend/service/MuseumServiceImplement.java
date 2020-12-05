package com.museum.worldmuseumbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.museum.worldmuseumbackend.dao.MuseumDAO;
import com.museum.worldmuseumbackend.entity.Museum;

@Service
public class MuseumServiceImplement implements MuseumService {

	private MuseumDAO museumDAO;
	
	@Autowired
	public MuseumServiceImplement(MuseumDAO theMuseumDAO) {
		museumDAO = theMuseumDAO;
	}
	
	@Override
	@Transactional // Handles transaction management so we don't have to manually start and commit transaction
	public List<Museum> findAll() {
		return museumDAO.findAll();
	}

	@Override
	@Transactional
	public void save(Museum theMuseum) {
		museumDAO.save(theMuseum);
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		museumDAO.deleteById(id);
		
	}

	@Override
	@Transactional
	public Museum findById(int id) {
		return museumDAO.findById(id);
	}

}

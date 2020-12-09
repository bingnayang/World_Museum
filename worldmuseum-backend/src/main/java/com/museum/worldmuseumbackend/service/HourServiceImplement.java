package com.museum.worldmuseumbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.museum.worldmuseumbackend.dao.HourDAO;
import com.museum.worldmuseumbackend.entity.Hour;

public class HourServiceImplement implements HourService {
	private HourDAO hourDAO;
	
	@Autowired
	public HourServiceImplement(HourDAO theHourDAO) {
		hourDAO = theHourDAO;
	}
	
	@Override
	@Transactional
	public void save(Hour theHour) {
		hourDAO.save(theHour);
	}

}

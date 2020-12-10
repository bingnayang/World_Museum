package com.museum.worldmuseumbackend.service;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Hour;

public interface HourService {
	public void save(Hour theHour);
	public List<Hour> findAll();
	public List<Hour> findByMuseumId(int museumId);
}

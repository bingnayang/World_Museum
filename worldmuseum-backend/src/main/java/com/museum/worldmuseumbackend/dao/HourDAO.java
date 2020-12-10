package com.museum.worldmuseumbackend.dao;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Hour;

public interface HourDAO {
	public void save(Hour theHour);
	public List<Hour> findAll();
	public List<Hour> findByMuseumId(int museumId);
}

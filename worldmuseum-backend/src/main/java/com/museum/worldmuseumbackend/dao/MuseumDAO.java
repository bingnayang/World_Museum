package com.museum.worldmuseumbackend.dao;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Museum;

public interface MuseumDAO {
	public List<Museum> findAll();
	public void save(Museum theMuseum);
	public void deleteById(int id);
	public Museum findById(int id);
}

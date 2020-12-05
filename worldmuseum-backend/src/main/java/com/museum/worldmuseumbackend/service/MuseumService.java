package com.museum.worldmuseumbackend.service;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Museum;

public interface MuseumService {
	public List<Museum> findAll();
	public void save(Museum theMuseum);
	public void deleteById(int id);
	public Museum findById(int id);
}

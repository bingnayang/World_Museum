package com.museum.worldmuseumbackend.dao;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Museum;

public interface MuseumDAO {
	public List<Museum> findAll();
}

package com.museum.worldmuseumbackend.dao;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Image;

public interface ImageDAO {
	List<Image> findByMuseumId(int museumId);
	void save(Image theImage);
}

package com.museum.worldmuseumbackend.service;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Image;

public interface ImageService {
	List<Image> findByMuseumId(int museumId);

	public void save(Image theImage);
}

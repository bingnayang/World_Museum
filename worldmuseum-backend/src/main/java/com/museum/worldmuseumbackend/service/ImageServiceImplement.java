package com.museum.worldmuseumbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.museum.worldmuseumbackend.dao.ImageDAO;
import com.museum.worldmuseumbackend.entity.Image;

@Service
public class ImageServiceImplement implements ImageService {
	private ImageDAO imageDAO;
	
	@Autowired
	public ImageServiceImplement(ImageDAO theImageDAO) {
		imageDAO = theImageDAO;
	}
	
	@Override
	@Transactional
	public List<Image> findByMuseumId(int museumId) {
		return imageDAO.findByMuseumId(museumId);
	}

	@Override
	@Transactional
	public void save(Image theImage) {
		imageDAO.save(theImage);
	}

}

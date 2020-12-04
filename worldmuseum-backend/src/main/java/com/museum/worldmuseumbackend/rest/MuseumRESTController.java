package com.museum.worldmuseumbackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museum.worldmuseumbackend.dao.MuseumDAO;
import com.museum.worldmuseumbackend.entity.Museum;

@RestController
@RequestMapping("/api")
public class MuseumRESTController {
	private MuseumDAO museumDAO;
	
	// Inject museum dao (use constructor injection)
	@Autowired
	public MuseumRESTController(MuseumDAO theMuseumDAO) {
		museumDAO = theMuseumDAO;
	}
	
	// GET "/museums" - return list of museums
	@GetMapping("/museums")
	public List<Museum> findAll(){
		return museumDAO.findAll();
	}
}

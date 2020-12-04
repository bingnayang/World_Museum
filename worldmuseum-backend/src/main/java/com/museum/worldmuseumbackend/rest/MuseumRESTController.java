package com.museum.worldmuseumbackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.museum.worldmuseumbackend.entity.Museum;
import com.museum.worldmuseumbackend.service.MuseumService;

@RestController
@RequestMapping("/api")
public class MuseumRESTController {
	private MuseumService museumService;
	
	// Inject museum dao (use constructor injection)
	@Autowired
	public MuseumRESTController(MuseumService theMuseumService) {
		museumService = theMuseumService;
	}
	
	// GET "/museums" - return list of museums
	@GetMapping("/museums")
	public List<Museum> findAll(){
		return museumService.findAll();
	}
}

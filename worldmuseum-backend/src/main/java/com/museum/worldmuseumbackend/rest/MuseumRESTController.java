package com.museum.worldmuseumbackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.museum.worldmuseumbackend.entity.Museum;
import com.museum.worldmuseumbackend.service.MuseumService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class MuseumRESTController {
	private MuseumService museumService;
	
	// Inject museum dao (use constructor injection)
	@Autowired
	public MuseumRESTController(MuseumService theMuseumService) {
		museumService = theMuseumService;
	}
	
	// GET "/museums" - return list of museums
	@GetMapping("/museums")
	public List<Museum> findAllMuseum(){
		return museumService.findAll();
	}
	
	// GET "/museums/{museumId} - get museum by id
	@GetMapping("/museums/{museumId}")
	public Museum getMuseumById(@PathVariable int museumId) {
		Museum theMuseum = museumService.findById(museumId);
		
		if(theMuseum == null) {
			throw new RuntimeException("Museum Id not found: "+museumId);
		}
		
		return theMuseum;
	}
	
	// POST "/museums - add new museum 
	@PostMapping("/museums")
	public Museum saveMuseum(@RequestBody Museum theMuseum) {
		theMuseum.setId(0);
		museumService.save(theMuseum);
		return theMuseum;
	}
	
	// PUT "/museums" - update existing museum
	@PutMapping("/museums")
	public Museum updateMuseum(@RequestBody Museum theMuseum) {
		museumService.save(theMuseum);
		return theMuseum;
	}
	
	// DELETE "/museums/{museumId}
	@DeleteMapping("/museums/{museumId}")
	public Museum deleteMuseumById(@PathVariable int museumId) {
		Museum theMuseum = museumService.findById(museumId);
		
		if(theMuseum == null) {
			throw new RuntimeException("Museum Id not found: "+museumId);
		}
		museumService.deleteById(museumId);
		return theMuseum;
	}
}

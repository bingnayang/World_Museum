package com.museum.worldmuseumbackend.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museum.worldmuseumbackend.entity.Hour;
import com.museum.worldmuseumbackend.entity.Museum;
import com.museum.worldmuseumbackend.service.HourService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class HourRESTController {
	private HourService hourService;

	public HourRESTController(HourService theHourService) {
		hourService = theHourService;
	}
	
	// POST "/hours - add new hours 
	@PostMapping("/hours")
	public Hour saveHour(@RequestBody Hour theHour) {
		theHour.setId(0);
		System.out.println(theHour);
		hourService.save(theHour);
		return null;
	}
	// GET "/hours" - return list of hours
	@GetMapping("/hours")
	public List<Hour> findAllHour(){
		return hourService.findAll();
	}
	// PUT "/hours" - update existing hour
	@PutMapping("/hours")
	public Hour updateMuseum(@RequestBody Hour theHour) {
		hourService.save(theHour);
		return theHour;
	}
	// GET "/hours/{museumId} - get hours by museum id
	@GetMapping("/hours/{museumId}")
	public List<Hour> getHourById(@PathVariable int museumId) {
		List<Hour> theHour = hourService.findByMuseumId(museumId);
		
		if(theHour == null) {
			throw new RuntimeException("Hour with museum id not found: "+museumId);
		}
		
		return theHour;
	}
}

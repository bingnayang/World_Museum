package com.museum.worldmuseumbackend.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	 
	@GetMapping("/hours")
	public List<Hour> findAllHour(){
		return hourService.findAll();
	}
}

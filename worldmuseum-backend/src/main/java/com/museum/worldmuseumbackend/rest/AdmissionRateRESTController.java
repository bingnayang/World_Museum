package com.museum.worldmuseumbackend.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museum.worldmuseumbackend.entity.AdmissionRate;
import com.museum.worldmuseumbackend.service.AdmissionRateService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class AdmissionRateRESTController {
	private AdmissionRateService rateService;
	
	public AdmissionRateRESTController(AdmissionRateService theRateService) {
		rateService = theRateService;
	}
	
	// POST "/rates - add new rates 
	@PostMapping("/rates")
	public void saveAdmissionRate(@RequestBody AdmissionRate theRate) {
		theRate.setId(0);
		System.out.println(theRate);
		rateService.save(theRate);
	}
	
}

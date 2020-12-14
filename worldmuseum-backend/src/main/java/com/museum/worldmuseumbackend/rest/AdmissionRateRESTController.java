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
	public AdmissionRate saveAdmissionRate(@RequestBody AdmissionRate theRate) {
		try {
			theRate.setId(0);
			System.out.println(theRate);
			rateService.save(theRate);
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return theRate;
	}
	
	// PUT "/rates" - update existing rates
	@PutMapping("/rates")
	public AdmissionRate updateAdmissionRate(@RequestBody AdmissionRate theRate) {
		rateService.save(theRate);
		return theRate;
	}
	
	// GET "/rates/{museumId} - get rates by museum id
	@GetMapping("/rates/{museumId}")
	public List<AdmissionRate> getRateById(@PathVariable int museumId) {
		List<AdmissionRate> theRate = rateService.findByMuseumId(museumId);
		
		if(theRate == null) {
			throw new RuntimeException("Admission Rate with museum id not found: "+museumId);
		}
		
		return theRate;
	}
	
}

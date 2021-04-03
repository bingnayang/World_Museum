package com.museum.worldmuseumbackend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.museum.worldmuseumbackend.entity.Image;
import com.museum.worldmuseumbackend.service.ImageService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ImageRESTController {
	private ImageService imageService;
	
	@Autowired
	public ImageRESTController(ImageService theImageService) {
		imageService = theImageService;
	}
	
	@GetMapping("/images/{museumId}")
	public List<Image> getByMuseumId(@PathVariable int museumId){
		List<Image> theImage = imageService.findByMuseumId(museumId);
		
		if(theImage == null) {
			throw new RuntimeException("Museum Id not found: "+museumId);
		}
		
		return theImage;
	}
	
	@PostMapping("/images")
	public Image saveImage(@RequestBody Image theImage) {
		theImage.setId(0);
		imageService.save(theImage);
		return theImage;
	}
}

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

import com.museum.worldmuseumbackend.entity.Comment;
import com.museum.worldmuseumbackend.entity.Museum;
import com.museum.worldmuseumbackend.service.CommentService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CommentRESTController {
	private CommentService commentService;
	
	@Autowired
	public CommentRESTController(CommentService theCommentService) {
		commentService = theCommentService;
	}
	
	@GetMapping("/comments/{museumId}")
	public List<Comment> getByMuseumId(@PathVariable int museumId) {
		List<Comment> theComment = commentService.findByMuseumId(museumId);
		
		if(theComment == null) {
			throw new RuntimeException("Museum Id not found: "+museumId);
		}
		
		return theComment;
	}
	
	@PostMapping("/comments")
	public Comment saveComment(@RequestBody Comment theComment) {
		theComment.setId(0);
		commentService.save(theComment);
		return theComment;
	}
	
}

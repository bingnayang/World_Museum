package com.museum.worldmuseumbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.museum.worldmuseumbackend.dao.CommentDAO;

@Service
public class CommentServiceImplement implements CommentService {
	private CommentDAO commentDAO;
	
	@Autowired
	public CommentServiceImplement(CommentDAO theCommentDAO) {
		commentDAO = theCommentDAO;
	}
	
	
}

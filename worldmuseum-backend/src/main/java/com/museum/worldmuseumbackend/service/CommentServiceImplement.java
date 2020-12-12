package com.museum.worldmuseumbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.museum.worldmuseumbackend.dao.CommentDAO;
import com.museum.worldmuseumbackend.entity.Comment;

@Service
public class CommentServiceImplement implements CommentService {
	private CommentDAO commentDAO;
	
	@Autowired
	public CommentServiceImplement(CommentDAO theCommentDAO) {
		commentDAO = theCommentDAO;
	}

	@Override
	@Transactional
	public List<Comment> findByMuseumId(int museumId) {
		return commentDAO.findByMuseumId(museumId);
	}
	
	
}

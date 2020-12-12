package com.museum.worldmuseumbackend.service;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Comment;

public interface CommentService {

	List<Comment> findByMuseumId(int museumId);

}

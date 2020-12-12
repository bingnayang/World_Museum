package com.museum.worldmuseumbackend.dao;

import java.util.List;

import com.museum.worldmuseumbackend.entity.Comment;

public interface CommentDAO {

	List<Comment> findByMuseumId(int museumId);

}

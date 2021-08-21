package com.javacompleto.curso.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.javacompleto.curso.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
}

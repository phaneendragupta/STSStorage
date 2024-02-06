package com.blog.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.app.demo.entity.Post;


public interface PostRepository extends JpaRepository<Post, Long>{
	
	

}

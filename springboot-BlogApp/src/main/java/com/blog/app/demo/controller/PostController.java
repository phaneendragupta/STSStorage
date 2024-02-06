package com.blog.app.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.app.demo.payload.PostDto;
import com.blog.app.demo.service.PostService;


@RestController
@RequestMapping("/api/posts")
public class PostController {
	private PostService postService;
	

	public PostController(PostService postService) {
		
		this.postService=postService;
	}
    
	//create blog post rest api
	@PostMapping
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
		return new ResponseEntity<>( postService.createPost(postDto),HttpStatus.CREATED);
		
	}
	
	
	
	
	
}

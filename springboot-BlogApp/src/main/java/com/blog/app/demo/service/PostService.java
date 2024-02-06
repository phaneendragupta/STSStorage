package com.blog.app.demo.service;

import org.springframework.http.ResponseEntity;

import com.blog.app.demo.payload.PostDto;

public interface PostService {

PostDto createPost(PostDto postDto);
}

package com.blog.app.demo.service.impl;

import org.springframework.stereotype.Service;

import com.blog.app.demo.entity.Post;
import com.blog.app.demo.payload.PostDto;
import com.blog.app.demo.repository.PostRepository;
import com.blog.app.demo.service.PostService;

@Service
public class PostServiceImpl implements PostService{

	private PostRepository  postRepository;
	
	
	public PostServiceImpl(PostRepository postRepository) {
		this.postRepository = postRepository;
	}




	public PostDto createPost(PostDto postDto) {
        
		// convert DTO to entity
		Post post =new Post();
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		
		Post newPost= postRepository.save(post);
		
		// convert entity to DTO
		
		PostDto postResponse = new PostDto();
		postResponse.setId(newPost.getId());
		postResponse.setTitle(newPost.getTitle());
		postResponse.setDescription(newPost.getDescription());
		postResponse.setContent(newPost.getContent());
		
		
		
		
		return postResponse;
	}

}

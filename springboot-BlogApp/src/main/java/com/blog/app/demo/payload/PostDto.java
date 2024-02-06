package com.blog.app.demo.payload;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class PostDto {
    private Long id;
	private  String title;
	private String description;
	private String content;

}

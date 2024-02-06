package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
public class HelloController {
		
@GetMapping(path = "/client")
public String hello() {
	RestTemplate resttemplate = new RestTemplate();
	ResponseEntity<String>result=resttemplate.getForEntity("http://localhost:8000/api/hello/Anil",String.class);
	String response=result.getBody();
	return response;
	
	}

}

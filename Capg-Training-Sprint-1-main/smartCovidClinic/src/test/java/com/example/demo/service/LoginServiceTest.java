package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entity.Login;
import com.example.demo.exception.EmailNotFoundException;
import com.example.demo.exception.PasswordNotSameException;

@SpringBootTest
class LoginServiceTest {
	
	@Autowired
	LoginServiceImpl loginServ;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void EmailTest() throws EmailNotFoundException, PasswordNotSameException{
		Login login= new Login();

		login.setLoginEmail("abcd@gmail.com");
		login.setLoginPassword("abcd123");
		assertEquals("abcd@gmail.com",login.getLoginEmail());
		assertEquals("abcd123.com",login.getLoginPassword());
	}
	
	
}
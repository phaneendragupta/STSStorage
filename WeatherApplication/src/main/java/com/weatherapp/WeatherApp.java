package com.weatherapp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.weatherapp.entities.User;
import com.weatherapp.repositories.UserRepository;


@SpringBootApplication
public class WeatherApp implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(WeatherApp.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


	@Override
	public void run(String... args) throws Exception {

	System.out.println("Entering CommandLineRunner");

		User admin = new User();
		admin.setPassword(passwordEncoder.encode("Admin@123"));
		admin.setUserEmail("admin@gmail.com");
		admin.setUserName("admin");
//		Role role = new Role();
//		role.setRole_name("ADMIN");
//		Set<Role> set = new HashSet<>();
//		set.add(role);
//		admin.setRoles(set);

		userRepo.save(admin);

	}
}



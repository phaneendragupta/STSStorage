package com.OnlineNurseryApplication;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.ArrayList;
import com.OnlineNurseryApplication.entities.Address;
import com.OnlineNurseryApplication.entities.User;
import com.OnlineNurseryApplication.entities.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;
import java.util.HashSet;

import com.OnlineNurseryApplication.repositories.UserRepository;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class OnlineNurseryPlantsApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(OnlineNurseryPlantsApplication.class, args);
	}
//	@Bean
//	   public Docket productApi() {
//	      return new Docket(DocumentationType.SWAGGER_2).select()
//	         .apis(RequestHandlerSelectors.basePackage("com.OnlineNurseryApplication")).build();
//	   }
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Entering CommandLineRunner");
		User admin = new User();
		admin.setPassword(passwordEncoder.encode("Admin@123"));
		admin.setUserEmail("admin@gmail.com");
		admin.setUserName("admin");
		Role role = new Role();
		role.setRole_name("ADMIN");
		Set<Role> set = new HashSet<>();
		set.add(role);
		admin.setRoles(set);
		Address add1 = new Address();
		add1.setCity("adminCity");
		add1.setColony("admin colony");
		add1.setHouseNo("14");
		add1.setPinCode(625016);
		add1.setState("TamilNadu");
		admin.setAddress(add1);

		userRepo.save(admin);

	}

}

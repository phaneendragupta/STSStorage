package com.OnlineNurseryApplication.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.*;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.OnlineNurseryApplication.security.JwtAuthenticationEntryPoint;
import com.OnlineNurseryApplication.security.JwtAuthenticationFilter;
import com.OnlineNurseryApplication.services.UserServiceImpl;

import lombok.RequiredArgsConstructor;
import springfox.documentation.swagger.web.SecurityConfiguration;


//Configuration annotation is used to mark this class a configuration class and include it in the spring context
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {
	
	@Autowired
	private final UserServiceImpl userService;
	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	
	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;
	
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable())
		        .exceptionHandling(exception -> exception.authenticationEntryPoint(jwtAuthenticationEntryPoint))
		        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		        .authorizeHttpRequests(auth -> 
		          auth.requestMatchers("/api/v1/auth/**",
		        		  				"/swagger-ui/**",
		        		  				"/v3/api-docs/**",
		        		  				"/User/**",
		        		  				"/admin/**").permitAll()
//		              .requestMatchers("/User/**").hasAnyAuthority("USER","ADMIN")
//		              .requestMatchers("/admin/**").hasAnyAuthority("ADMIN")
		              .anyRequest().authenticated()
		        );
		    
		    http.authenticationProvider(authenticationProvider());

		    http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
		    
		    return http.build();

}

@Bean
public PasswordEncoder passwordEncoder() {
return new BCryptPasswordEncoder();
}

@Bean
public DaoAuthenticationProvider authenticationProvider() {
DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
authProvider.setUserDetailsService(userService);
authProvider.setPasswordEncoder(passwordEncoder());
return authProvider;
}

@Bean
public AuthenticationManager authenticationManager(AuthenticationConfiguration config)
    throws Exception {
return config.getAuthenticationManager();
}
		
	}



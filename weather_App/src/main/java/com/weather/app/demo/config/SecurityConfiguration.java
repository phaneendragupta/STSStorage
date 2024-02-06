//package com.weather.app.demo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import com.weather.app.demo.service.UserService;
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
//public class SecurityConfiguration  {
//
//		@Autowired
//		private UserService userService;
//		
//		@Bean
//	    public BCryptPasswordEncoder passwordEncoder() {
//	        return new BCryptPasswordEncoder();
//	    }
//		
//		@Bean
//	    public DaoAuthenticationProvider authenticationProvider() {
//	        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
//	        auth.setUserDetailsService(userService);
//	        auth.setPasswordEncoder(passwordEncoder());
//	        return auth;
//	    }
//		
////		@Override
////	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////	        auth.authenticationProvider(authenticationProvider());
////	    }
//		
////		@Override
////		protected void configure(HttpSecurity http) throws Exception {
////			http.authorizeRequests().antMatchers(
////					 "/user/**").hasRole("ADMIN")
////			.anyRequest().authenticated()
////			.and()
////			.formLogin()
////		    .and()
////			.httpBasic();
//////			.invalidateHttpSession(true)
//////			.clearAuthentication(true)
//////			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//////			.logoutSuccessUrl("/login?logout")
//////			.permitAll();
////		}
//
//
//
//}

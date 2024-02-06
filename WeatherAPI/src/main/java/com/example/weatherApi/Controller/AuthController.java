//package com.example.weatherApi.Controller;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class AuthController {
//
//    @GetMapping("/login")
//    public String login() {
//        return "Please log in";
//    }
//
//    @GetMapping("/logout")
//    public String logout() {
//        return "You have been logged out";
//    }
//
//    @GetMapping("/username")
//    public String currentUsername() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        return authentication.getName();
//    }
//}

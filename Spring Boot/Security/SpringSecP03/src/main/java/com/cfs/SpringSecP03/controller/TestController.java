package com.cfs.SpringSecP03.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/public/hello")
    Map<String,String> publicURL(){
        return Map.of("message","Public api");
    }
    @GetMapping("/profile")
    Map<String ,String> profile(Principal principal){
        return Map.of("LoggedInUser",principal.getName(),"authenticated","http session");
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}


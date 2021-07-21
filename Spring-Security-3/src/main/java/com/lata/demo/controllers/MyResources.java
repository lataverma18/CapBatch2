package com.lata.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lata.demo.entities.Users;
import com.lata.demo.services.MyUserDetailsService;

@RestController

public class MyResources {
	@Autowired
	MyUserDetailsService uds;

	@GetMapping("/user")
	public String greet() {
		return "Welcome!!!";
	}

	@GetMapping("/admin")
	public String greet1() {
		return "Admin!!!";
	}
	}

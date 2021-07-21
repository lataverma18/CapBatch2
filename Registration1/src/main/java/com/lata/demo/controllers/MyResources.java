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
import com.lata.demo.repository.UserRepository;


@RestController

public class MyResources {
	@Autowired
	UserRepository ur;

	@PostMapping("/register")
	public Users register(@RequestBody Users user) {
		BCryptPasswordEncoder b=new BCryptPasswordEncoder();
		String epwd=b.encode(user.getPassword());
		user.setPassword(epwd);
		ur.save(user);
		return user;
		
	}

}	

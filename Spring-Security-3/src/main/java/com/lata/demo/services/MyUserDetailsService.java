package com.lata.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lata.demo.entities.Users;
import com.lata.demo.repository.UserRepository;

@Service("uds")
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> user=ur.findUsersByUsername(username);
		
		return user.map(Principle::new).get();
	}
	public void addUser(Users user)
	{
		ur.save(user);
	}
}

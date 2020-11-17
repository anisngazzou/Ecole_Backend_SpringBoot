package org.poly.controller;

import java.util.Optional;

import org.poly.entities.User;
import org.poly.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/user/{id}")
	public Optional<User> getUserById(@PathVariable Long id)
	{
		return userRepository.findById(id);
	}

}

package com.personal.phonebook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.phonebook.entity.Users;
import com.personal.phonebook.service.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@GetMapping("{id}")
	public ResponseEntity<?> getUser(@PathVariable("id") String id){
		 Users user = userService.getUser(id);
		 
		 if (user == null)
				return new ResponseEntity<>("User with Userid " + id + " DOES NOT EXISTS", HttpStatus.NOT_ACCEPTABLE);
			
		 return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	
	@PostMapping("/registration")
	public ResponseEntity<?> registerUser(@Valid @RequestBody Users user) {
		
		Users existingUser = userService.findByLogin(user.getLogin());
		if (existingUser != null) {
			return ResponseEntity.badRequest().body("User Already Exists");			
		}
		userService.save(user);
		return ResponseEntity.ok(user);

	}
}

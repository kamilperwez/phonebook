package com.personal.phonebook.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.phonebook.entity.Contacts;
import com.personal.phonebook.service.HomeService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private HomeService homeService;
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Contacts>> getAllContacts(@PathVariable("userId") Integer userId) {
		List<Contacts> allContacts = homeService.findAllContacts(userId);
		if(allContacts.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(allContacts);
	}

}

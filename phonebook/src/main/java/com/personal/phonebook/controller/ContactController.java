package com.personal.phonebook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.phonebook.entity.Contacts;
import com.personal.phonebook.service.ContactService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ContactController.class);
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/add-contact")
	public ResponseEntity<Contacts> addNewContact(@Valid @RequestBody Contacts contact) {
		if (contact != null) {
//			Users user = userService.getUser(userId);
//			contact.set(user);
			contactService.createContact(contact);
		}
		return ResponseEntity.ok().body(contact);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable("id") Long contactId) {
		if (contactId != null) {
			contactService.deleteContact(contactId);
		}
		return ResponseEntity.ok().body("Deleted contact with id - "+ contactId);
	}
	
	@PutMapping("/edit")
	public ResponseEntity<?> editContact(@Valid @RequestBody Contacts contact) {
		
		if (contact != null) {
			Boolean contactUpdate = contactService.editContact(contact);
			if(contactUpdate.booleanValue() == true) {
				return ResponseEntity.ok().body(contact);
			}
		}
		
		return ResponseEntity.badRequest().body("Contact with given userId - "+contact.getUserId() +" does not exist");
	}

}

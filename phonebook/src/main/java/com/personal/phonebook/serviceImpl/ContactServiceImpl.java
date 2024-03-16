package com.personal.phonebook.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.phonebook.entity.Contacts;
import com.personal.phonebook.model.ContactModel;
import com.personal.phonebook.repository.ContactRepository;
import com.personal.phonebook.service.ContactService;
import com.personal.phonebook.service.UserService;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactRepository contactRepo;
	
	@Autowired
	UserService userService;

	@Override
	public void createContact(Contacts contact) {
			contactRepo.save(contact);
	}

	@Override
	public void deleteContact(Long contactId) {

		contactRepo.deleteById(contactId);
	}

	@Override
	public Boolean editContact(Contacts contact) {
		
		Optional<Contacts> existingContact = contactRepo.findById(contact.getContactId());
		
		if(existingContact.isPresent()) {
			contactRepo.save(contact);
			return true;
		}
		return false;
		
	}
	
}

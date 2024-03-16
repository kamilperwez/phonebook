package com.personal.phonebook.service;

import com.personal.phonebook.entity.Contacts;

public interface ContactService {
	
	public void createContact(Contacts contact);
	
	public void deleteContact(Long contactId);
	
	public Boolean editContact(Contacts contact);

}

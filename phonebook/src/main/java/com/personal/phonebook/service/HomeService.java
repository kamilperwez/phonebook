package com.personal.phonebook.service;

import java.util.List;

import com.personal.phonebook.entity.Contacts;

public interface HomeService {

	public List<Contacts> findAllContacts(Integer userId);
}

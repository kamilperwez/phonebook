package com.personal.phonebook.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.phonebook.entity.Contacts;
import com.personal.phonebook.entity.Users;
import com.personal.phonebook.repository.ContactRepository;
import com.personal.phonebook.repository.UserRepository;
import com.personal.phonebook.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ContactRepository contactRepo;

	@Override
	public List<Contacts> findAllContacts(Integer userId) {
		List<Contacts> allContacts = new ArrayList<>();
		Optional<Users> user = userRepo.findById(userId);
		if(user.isPresent()) {
			allContacts = contactRepo.findAllByUserId(userId);
		}
		return allContacts;
	}

}

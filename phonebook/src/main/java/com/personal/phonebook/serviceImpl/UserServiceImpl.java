package com.personal.phonebook.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.phonebook.entity.Users;
import com.personal.phonebook.repository.UserRepository;
import com.personal.phonebook.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public Users getUser(String id) {

		Optional<Users> user = userRepo.findById(Integer.valueOf(id));
		if (!user.isPresent())
			return null;
		
		return user.get();
	}

	@Override
	public Users findByLoginAndPassword(String login, String password) {
		Users user = null;
		if (login != null && password != null) {
			user = userRepo.findByLoginAndPassword(login, password);
		}
		return user;
	}

	@Override
	public Users findByLogin(String login) {
		if (login != null) {
			return userRepo.findByLogin(login);
		}
		return null;
	}
	
	@Override
	public void save(Users user) {
		if (user != null) {
			userRepo.save(user);
		}

	}

}

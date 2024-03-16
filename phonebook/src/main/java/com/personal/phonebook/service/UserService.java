package com.personal.phonebook.service;

import com.personal.phonebook.entity.Users;

public interface UserService {
	
	public Users getUser(String id);
	
	public Users findByLoginAndPassword(String login, String password);

	public Users findByLogin(String login);
	
	public void save(Users user);

}

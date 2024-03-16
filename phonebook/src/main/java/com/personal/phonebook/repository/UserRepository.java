package com.personal.phonebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.phonebook.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	
	/**
	 * Get user from database by login and password
	 * 
	 * @param login
	 * @param password
	 * @return found user
	 */
	Users findByLoginAndPassword(String login, String password);

	/**
	 * Finds user by login
	 * 
	 * @param login
	 * @return user object
	 */
	Users findByLogin(String login);

}

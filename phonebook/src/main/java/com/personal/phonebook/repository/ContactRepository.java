package com.personal.phonebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.phonebook.entity.Contacts;
import com.personal.phonebook.entity.Users;

@Repository
public interface ContactRepository extends JpaRepository<Contacts, Long>{
	
	List<Contacts> findAllByUserId(Integer userId);

}

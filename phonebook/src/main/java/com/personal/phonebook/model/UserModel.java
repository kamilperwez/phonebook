package com.personal.phonebook.model;

import java.util.List;

import com.personal.phonebook.entity.Contacts;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserModel {
	
	private Integer userId;
	
	private String name;
		
	private String surname;
	
	private String middlename;
	
	private String login;
	
	private String password;

	private List<Contacts> contactsList;

}

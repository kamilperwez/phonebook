package com.personal.phonebook.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@SequenceGenerator(name="seqUser", initialValue = 10002)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqUser")
	@Column(length=5, name = "user_id")
	private Integer userId;
	
	@Column(name = "name")
	@Size(min = 3, max = 30, message = "This is required field min 5 symbols")
	private String name;
	
	@Column(name = "surname")
	@Size(min = 0, max = 30, message = "This is required field min 5 symbols")
	private String surname;
	
	@Column(name = "middlename")
	@Size(min = 0, max = 30, message = "This is required field min 5 symbols")
	private String middlename;
	
	@Column(name = "login")
	@Size(min = 3, max = 30, message = "This is required field min 3 symbols")
	@Pattern(regexp = "[A-Za-z]+", message = "Only English characters")
	private String login;
	
	@Column(name = "password")
	@Size(min = 5, max = 50, message = "This is required field and min 5 symbols")
	private String password;
	
	@Transient
	private List<Contacts> contactsList;

	public Users() {
	}

	
	public Users(Integer userId, @Size(min = 5, max = 30, message = "This is required field min 5 symbols") String name,
			@Size(min = 5, max = 30, message = "This is required field min 5 symbols") String surname,
			@Size(min = 5, max = 30, message = "This is required field min 5 symbols") String middlename,
			@Size(min = 3, max = 30, message = "This is required field min 3 symbols") @Pattern(regexp = "[A-Za-z]+", message = "Only English characters") String login,
			@Size(min = 5, max = 50, message = "This is required field and min 5 symbols") String password,
			List<Contacts> contactsList) {
		super();
		this.userId = userId;
		this.name = name;
		this.surname = surname;
		this.middlename = middlename;
		this.login = login;
		this.password = password;
		this.contactsList = contactsList;
	}


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Contacts> getContactsList() {
		return contactsList;
	}

	public void setContactsList(List<Contacts> contactsList) {
		this.contactsList = contactsList;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", surname=" + surname + ", middlename=" + middlename
				+ ", login=" + login + ", password=" + password + ", contactsList=" + contactsList + "]";
	}

}

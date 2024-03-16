package com.personal.phonebook.model;

public class ContactModel {
	
	private Long contactId;

	private String name;

	private String surname;
	
	private String middlename;
	
	private String homephone;

	private String mobilephone;

	private String email;
	
	private String workphone;

	private String address;
	
	private Integer userId;

	public ContactModel() {
		super();
	}

	public ContactModel(Long contactId, String name, String surname, String middlename, String homephone,
			String mobilephone, String email, String workphone, String address, Integer userId) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.surname = surname;
		this.middlename = middlename;
		this.homephone = homephone;
		this.mobilephone = mobilephone;
		this.email = email;
		this.workphone = workphone;
		this.address = address;
		this.userId = userId;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
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

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkphone() {
		return workphone;
	}

	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ContactModel [contactId=" + contactId + ", name=" + name + ", surname=" + surname + ", middlename="
				+ middlename + ", homephone=" + homephone + ", mobilephone=" + mobilephone + ", email=" + email
				+ ", workphone=" + workphone + ", address=" + address + ", userId=" + userId + "]";
	}
	
	

}

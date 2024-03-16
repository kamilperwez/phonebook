package com.personal.phonebook.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "contacts")
public class Contacts implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@SequenceGenerator(name="seq", initialValue = 1000000003)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seq")
		@Column(length=10, name = "contact_id")
		private Long contactId;
		
		@Column(name = "name")
		@Size(min = 1, max = 30, message = "This is required field min 1 symbol")
		private String name;
		
		@Column(name = "surname")
		@Size(min = 0, max = 30, message = "This is not required field min 0 symbol")
		private String surname;
		
		@Column(name = "middlename")
		@Size(min = 0, max = 30, message = "This is not required field min 0 symbol")
		private String middlename;
		
		@Column(name = "homephone")
		private String homephone;
		
		@Column(name = "mobilephone")
		@Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone format, should be as xxxxxxxxxx")
		private String mobilephone;
		
		@Column(name = "email")
		@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message = "Invalid email")
		private String email;
		
		@Column(name = "workphone")
		private String workphone;
		
		@Column(name = "address")
		@Size(min = 0, max = 40)
		private String address;
		
		private Integer userId;

		public Contacts() {
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
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((address == null) ? 0 : address.hashCode());
			result = prime * result + ((contactId == null) ? 0 : contactId.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((homephone == null) ? 0 : homephone.hashCode());
			result = prime * result + ((middlename == null) ? 0 : middlename.hashCode());
			result = prime * result + ((mobilephone == null) ? 0 : mobilephone.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((surname == null) ? 0 : surname.hashCode());
			result = prime * result + ((userId == null) ? 0 : userId.hashCode());
			result = prime * result + ((workphone == null) ? 0 : workphone.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contacts other = (Contacts) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (contactId == null) {
				if (other.contactId != null)
					return false;
			} else if (!contactId.equals(other.contactId))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (homephone == null) {
				if (other.homephone != null)
					return false;
			} else if (!homephone.equals(other.homephone))
				return false;
			if (middlename == null) {
				if (other.middlename != null)
					return false;
			} else if (!middlename.equals(other.middlename))
				return false;
			if (mobilephone == null) {
				if (other.mobilephone != null)
					return false;
			} else if (!mobilephone.equals(other.mobilephone))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (surname == null) {
				if (other.surname != null)
					return false;
			} else if (!surname.equals(other.surname))
				return false;
			if (userId == null) {
				if (other.userId != null)
					return false;
			} else if (!userId.equals(other.userId))
				return false;
			if (workphone == null) {
				if (other.workphone != null)
					return false;
			} else if (!workphone.equals(other.workphone))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Contacts [contactId=" + contactId + ", name=" + name + ", surname=" + surname + ", middlename="
					+ middlename + ", homephone=" + homephone + ", mobilephone=" + mobilephone + ", email=" + email
					+ ", workphone=" + workphone + ", address=" + address + ", userId=" + userId + "]";
		}

}

package com.project.elearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_contact")
public class Contact {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idContact;
	private String name;
	private String email;
	private String phoneNo;
	private String message;
	
	
	public long getIdContact() {
		return idContact;
	}
	public void setIdContact(long idContact) {
		this.idContact = idContact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

package com.project.elearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_admin")
public class UserAdmin {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idAdmin;
	private String admin;
	private String emailAdmin;
	private String passwordAdmin;
	
	
	public long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getEmailAdmin() {
		return emailAdmin;
	}
	public void setEmailAdmin(String emailAdmin) {
		this.emailAdmin = emailAdmin;
	}
	public String getPasswordAdmin() {
		return passwordAdmin;
	}
	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}
	
	
	

}

package com.project.elearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_feedback")
public class Feedback {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idFeedback;
	private String name;
	private String email;
	private String feedback;
	
	public long getIdFeedback() {
		return idFeedback;
	}
	public void setIdFeedback(long idFeedback) {
		this.idFeedback = idFeedback;
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
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
	

}

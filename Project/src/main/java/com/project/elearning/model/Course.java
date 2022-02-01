package com.project.elearning.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_course")
public class Course {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idCourse;
	private String course;
	private String resourc;
	private String descrip;
	
	
	public long getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(long idCourse) {
		this.idCourse = idCourse;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getResourc() {
		return resourc;
	}
	public void setResourc(String resourc) {
		this.resourc = resourc;
	}
	
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	
	
	
	

}

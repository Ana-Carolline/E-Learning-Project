package com.project.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.elearning.model.Course;
import com.project.elearning.repository.CourseRepository;

@RestController
@RequestMapping ("/course")
@CrossOrigin ("*")
public class CourseController {
	
	@Autowired
	private CourseRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Course>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}

}

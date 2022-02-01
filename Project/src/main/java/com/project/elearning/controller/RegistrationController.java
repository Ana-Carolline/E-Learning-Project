package com.project.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.elearning.model.Registration;
import com.project.elearning.repository.RegistrationRepository;

@RestController
@RequestMapping ("/register")
@CrossOrigin ("*")
public class RegistrationController {

	@Autowired
	private RegistrationRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Registration>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}	
}

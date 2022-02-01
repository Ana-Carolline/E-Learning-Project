package com.project.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.elearning.model.Contact;
import com.project.elearning.repository.ContactRepository;

@RestController
@RequestMapping ("/contact")
@CrossOrigin ("*")
public class ContactController {
	
	@Autowired
	private ContactRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Contact>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

}

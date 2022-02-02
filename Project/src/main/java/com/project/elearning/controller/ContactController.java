package com.project.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.elearning.model.Contact;
import com.project.elearning.model.UserAdmin;
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
	
	@GetMapping ("/{contactId}")
	public ResponseEntity<Contact> getById (@PathVariable long contactId){
		return repository.findById(contactId).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Contact> post (@RequestBody Contact contact) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(contact));
	}
	
	@PutMapping
	public ResponseEntity<Contact> put (@RequestBody Contact contact) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(contact));
	}

	@DeleteMapping("/{idContact}")
	public void delete (@PathVariable long idContact) {
		repository.deleteById(idContact);
	}
}

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

import com.project.elearning.model.Registration;
import com.project.elearning.model.UserAdmin;
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
	
	@GetMapping ("/{registId}")
	public ResponseEntity<Registration> getById (@PathVariable long registId){
		return repository.findById(registId).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Registration> post (@RequestBody Registration registration) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(registration));
	}
	
	@PutMapping
	public ResponseEntity<Registration> put (@RequestBody Registration registration) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(registration));
	}
	
	@DeleteMapping("/{idRegister}")
	public void delete (@PathVariable long idRegister) {
		repository.deleteById(idRegister);
	}
}

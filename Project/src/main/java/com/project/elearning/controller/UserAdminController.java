package com.project.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.elearning.model.UserAdmin;
import com.project.elearning.repository.UserAdminRepository;

@RestController
@RequestMapping ("/admin")
@CrossOrigin ("*")
public class UserAdminController {
	
	@Autowired
	private UserAdminRepository repo;
	
	@GetMapping
	public ResponseEntity<List<UserAdmin>> getAll() {
		return ResponseEntity.ok(repo.findAll());
	}
	
	@GetMapping ("/{adminId}")
	public ResponseEntity<UserAdmin> getById (@PathVariable long adminId) {
		return repo.findById(adminId).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<UserAdmin> post (@RequestBody UserAdmin userAdmin) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(userAdmin));
	}
	
	@PutMapping
	public ResponseEntity<UserAdmin> put (@RequestBody UserAdmin userAdmin) {
		return ResponseEntity.status(HttpStatus.OK).body(repo.save(userAdmin));
	}
	
	@DeleteMapping("/{idAdmin}")
	public void delete (@PathVariable long idAdmin) {
		repo.deleteById(idAdmin);
	}
	
	
}

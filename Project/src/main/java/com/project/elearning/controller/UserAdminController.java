package com.project.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

}

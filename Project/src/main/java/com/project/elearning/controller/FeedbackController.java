package com.project.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.elearning.model.Feedback;
import com.project.elearning.repository.FeedbackRepository;

@RestController
@RequestMapping ("/feedback")
@CrossOrigin ("*")
public class FeedbackController {

	@Autowired
	private FeedbackRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Feedback>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
}

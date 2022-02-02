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

import com.project.elearning.model.Feedback;
import com.project.elearning.model.UserAdmin;
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
	
	@GetMapping("/{feedbackId}")
	public ResponseEntity<Feedback> getById (@PathVariable long feedbackId) {
		return repository.findById(feedbackId).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Feedback> post (@RequestBody Feedback feedback) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(feedback));
	}
	
	@PutMapping
	public ResponseEntity<Feedback> put (@RequestBody Feedback feedback) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(feedback));
	}
	
	@DeleteMapping("/{idfeed}")
	public void delete (@PathVariable long idfeed) {
		repository.deleteById(idfeed);
	}
}

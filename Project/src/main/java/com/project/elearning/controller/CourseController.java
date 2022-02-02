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

import com.project.elearning.model.Course;
import com.project.elearning.model.UserAdmin;
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
	
	@GetMapping ("/{courseId}")
	public ResponseEntity<Course> getById (@PathVariable long courseId) {
		return repository.findById(courseId).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Course> post (@RequestBody Course course) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(course));
	}
	
	@PutMapping
	public ResponseEntity<Course> put (@RequestBody Course course) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(course));
	}
	
	@DeleteMapping("/{idCourse}")
	public void delete (@PathVariable long idCourse) {
		repository.deleteById(idCourse);
	}

}

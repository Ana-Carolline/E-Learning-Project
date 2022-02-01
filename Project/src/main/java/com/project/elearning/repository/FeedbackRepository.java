package com.project.elearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.elearning.model.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long>{ 
	public List<Feedback> findAllByEmailContainingIgnoreCase (String email);
}

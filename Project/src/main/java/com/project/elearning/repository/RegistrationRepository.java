package com.project.elearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.elearning.model.Registration;

@Repository 
public interface RegistrationRepository extends JpaRepository<Registration, Long>{
	public List<Registration> findAllByNameContainingIgnoreCase (String name);
}

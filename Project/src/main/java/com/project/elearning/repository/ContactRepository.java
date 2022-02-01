package com.project.elearning.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.elearning.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
	public List<Contact> findAllByNameContainingIgnoreCase (String name);
	

}

package com.project.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.elearning.model.UserAdmin;

@Repository
public interface UserAdminRepository extends JpaRepository<UserAdmin, Long> {
	
}

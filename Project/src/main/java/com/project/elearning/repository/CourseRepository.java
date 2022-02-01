package com.project.elearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.elearning.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
	public List<Course> findAllByCourseContainingIgnoreCase (String course );
}

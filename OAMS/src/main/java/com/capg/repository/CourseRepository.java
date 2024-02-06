package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}

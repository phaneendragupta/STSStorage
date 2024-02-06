package com.capg.service;

import java.util.List;

import com.capg.entity.Course;

public interface CourseService {

	public Course saveCourse(Course course);

	public List<Course> fetchCourseList();

	
	/*
	 * public Course fetchCourseById(Integer courseId);
	 * 
	 * public void deleteCourseById(Integer courseId);
	 * 
	 * public Course updateCourse(Integer courseId, Course course);
	 */
	 

}

package com.capg.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Course;
import com.capg.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Course saveCourse(Course course) {
		
		return courseRepository.save(course);
	}

	@Override
	public List<Course> fetchCourseList() {
		
		return courseRepository.findAll();
	}

	
	/*
	 * @Override public Course fetchCourseById(Integer courseId) {
	 * 
	 * return courseRepository.findById(courseId).get(); }
	 * 
	 * @Override public void deleteCourseById(Integer courseId) {
	 * courseRepository.deleteById(courseId);
	 * 
	 * }
	 * 
	 * @Override public Course updateCourse(Integer courseId, Course course) {
	 * Course docDB = courseRepository.findById(courseId).get();
	 * 
	 * if(Objects.nonNull(course.getCourseName()) &&
	 * !"".equalsIgnoreCase(course.getCourseName())) {
	 * docDB.setCourseName(course.getCourseName()); }
	 * 
	 * return courseRepository.save(docDB); }
	 */
	 

}

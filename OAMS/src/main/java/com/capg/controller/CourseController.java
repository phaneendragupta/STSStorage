package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Course;
import com.capg.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/courses")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	
	@GetMapping("/courses")
	public List<Course> fetchCourseList(){
		return courseService.fetchCourseList();
		
	}
	
	
	/*
	 * @GetMapping("/courses/{id}") public Course
	 * fetchCourseById(@PathVariable("id") Integer courseId) { return
	 * courseService.fetchCourseById(courseId);
	 * 
	 * }
	 * 
	 * @DeleteMapping("/courses/{id}") public String
	 * deleteCourseById(@PathVariable("id") Integer courseId) {
	 * courseService.deleteCourseById(courseId); return "Course deleted"; }
	 * 
	 * @PutMapping("/courses/{id}") public Course updateCourse(@PathVariable("id")
	 * Integer courseId, @RequestBody Course course) { return
	 * courseService.updateCourse(courseId,course); }
	 */
	 

}

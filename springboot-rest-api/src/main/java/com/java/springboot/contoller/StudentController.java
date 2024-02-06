package com.java.springboot.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.java.springboot.entity.Student;

@RestController
public class StudentController {
  
	@GetMapping("student")
	public ResponseEntity< Student >  getstudent() {
		Student s= new Student(1,"Rajiv","Shetty");
		//return new ResponseEntity<>(s,HttpStatus.OK);
		return ResponseEntity.ok().header("header_name","rajiv").body(s);
		
	}
	@GetMapping("students")
	public List<Student> getstudents(){
		List<Student> S= new ArrayList<>();
		S.add(new Student(1,"Ram","Shetty"));
		S.add(new Student(2,"Kiran","Rathod"));
	    S.add(new Student(3,"Shekar","Kanna"));
	    S.add(new Student(4,"Srinivas","Reddy"));
	    return S;
		
	}
	@GetMapping("student/{id}/{fname}")
	public Student studentPathVariable(@PathVariable int id,@PathVariable String fname) {
		Student s= new Student(id, fname, "Rajan");
		return s;
		
	}
	@GetMapping("student/query")
	public Student studentRequestParam(@RequestParam int id, @RequestParam String fname) {
		Student s=new Student(id, fname, "Narayana");
		return s;
	}
	
	
	@PostMapping("student/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student) {
		student.getId();
		student.getfName();
		student.getlName();
		return student;
		
			}
	@PutMapping("student/{id}/update")
	//@ResponseStatus(HttpStatus.OK)
	public Student updateStudent(@RequestBody Student student,@PathVariable("id")int studentId) {
		
		student.getfName();
		student.getlName();
		return student;
		}
	
	
	@DeleteMapping("student/{id}/delete")
	
	public String deleteStudent(@PathVariable("id") int studentId) {
		
		System.out.println(studentId);
		return "Deleted Successfully";
	}
	
	

}

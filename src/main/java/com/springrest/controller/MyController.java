package com.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entities.Courses;
import com.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses applications.";
	}
	//get the courses
	
	@GetMapping("/courses")
	public List<Courses> getCourses1(){
		return this.courseService.getCourses();
		
		
	}
	@GetMapping("/courses/{id}")
	public Courses getCourses(@PathVariable long id) {
		return this.courseService.getCourses(id);
		
		
	}
	
	//add courses
	@PostMapping(path="/courses")
	public Courses addCourses(@RequestBody Courses courses){
		{
		}	return this.courseService.addCourses(courses);
	}
	
		//update course using PUT request
		@PutMapping("/courses")
		public Courses updateCourses(@RequestBody Courses courses) {
			return this.courseService.updateCourses(courses);
		}
		//delete the courses
		@DeleteMapping("/courses/{id}")
		public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String id){
			try {
				this.courseService.deleteCourses(Long.parseLong(id));
				return new ResponseEntity<>(HttpStatus.OK);
				
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	
	
}




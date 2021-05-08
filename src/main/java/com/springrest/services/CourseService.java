package com.springrest.services;

import java.util.List;

import com.springrest.entities.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	
    public Courses getCourses(long id);

	Courses getCourses1(long id);
	
	
	public Courses addCourses(Courses courses);
	
	public Courses updateCourses(Courses courses);
	
	public void deleteCourses(long parseLong);
	
}

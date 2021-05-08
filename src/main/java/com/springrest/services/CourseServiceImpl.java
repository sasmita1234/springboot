package com.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CourseDao;
import com.springrest.entities.*;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	//List<Courses> list;
	public CourseServiceImpl() {
		//list =new ArrayList<>();
		//list.add(new Courses(145,"Java Core Course","this course contains core of java."));
		//list.add(new Courses(4343,"Spring Boot","Creating spring boot classes."));
		
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Courses getCourses(long id) {
		// TODO Auto-generated method stub
		return courseDao.getOne(id);
	}

	@Override
	public Courses getCourses1(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Courses addCourses(Courses courses) {
		// TODO Auto-generated method stub
		courseDao.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourses(Courses courses) {
		courseDao.save(courses);
		return courses;
	}

	@Override
	public void deleteCourses(long parseLong) {
		Courses entity=courseDao.getOne(parseLong);
		
		courseDao.delete(entity);
	}
	
	
	//@Override
	//public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		//return list;
	}
	
	
	//@Override
	//public Courses getCourses1(long id) {
		//Courses c = null;
		//for(Courses courses : list) {
			//if(courses.getId()==id) {
				//c = courses;
				//break;
			//}
		//}
		//return c;
	//}


//	@Override
//	public Courses getCourses(long id) {
//		Courses c = null;
//		for(Courses courses : list) {
//			c = courses;
//			break;
//		}
//		return c;
//	}


//	@Override
//	public Courses addCourses(Courses courses) {
//		list.add(courses);
//		
//		return courses;
//	}
//
//
//	@Override
//	public Courses updateCourses(Courses courses) {
//		list.forEach(e -> {
//			if(e.getId() == courses.getId()) {
//				e.setId(courses.getTitle());
//				e.setDescription(courses.getDescription());
//				
//			}
//		});
//		return courses;
//	}
//
//
//	@Override
//	public void deleteCourses(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
//		
//	}
	



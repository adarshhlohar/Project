package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Courses;


public interface CoursesService {
	
	Courses getCourseDetail(int cid);
	
	List<Courses> getAllCourses();
	
}


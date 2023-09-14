package com.anudip.sb.service;

import java.util.List;

import com.anudip.sb.entity.Courses;

public interface CourseService {
	
	Courses getCourseDetail(int cid);
	
	List<Courses> getAllCourses();
		
	
}

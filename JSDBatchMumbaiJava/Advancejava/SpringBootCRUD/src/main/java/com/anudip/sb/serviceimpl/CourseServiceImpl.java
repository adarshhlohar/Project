package com.anudip.sb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.sb.entity.Courses;
import com.anudip.sb.exception.CourseNotFoundException;
import com.anudip.sb.repository.CourseRepository;
import com.anudip.sb.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseRepository crepo;

	@Override
	public Courses getCourseDetail(int cid) {
		// TODO Auto-generated method stub
		return crepo.findById(cid).orElseThrow(()-> new CourseNotFoundException("Incorrect Course Entered"));
	}

	@Override
	public List<Courses> getAllCourses() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

}

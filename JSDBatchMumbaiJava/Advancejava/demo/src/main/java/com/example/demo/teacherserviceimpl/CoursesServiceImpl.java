package com.example.demo.teacherserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Courses;
import com.example.demo.exception.CourseIdNotFindException;
import com.example.demo.repository.CoursesRepository;
import com.example.demo.service.CoursesService;


@Service
public class CoursesServiceImpl implements CoursesService{

	@Autowired
	CoursesRepository crepo;
	
	@Override
	public Courses getCourseDetail(int cid) {
		return crepo.findById(cid).orElseThrow(()-> new CourseIdNotFindException("Incorrect Course Entered"));
	}

	@Override
	public List<Courses> getAllCourses() {
		return crepo.findAll();
		}

	

}

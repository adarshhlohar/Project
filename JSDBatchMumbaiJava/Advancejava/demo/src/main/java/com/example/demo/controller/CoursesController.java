package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Courses;
import com.example.demo.service.CoursesService;

@RestController
public class CoursesController {
	
	@Autowired
	CoursesService cs;
	
	@GetMapping("/getCourse/{cid}")
	public ResponseEntity<Courses> getCourseDetail(@PathVariable("cid") int cid) {
		return new ResponseEntity<Courses>(cs.getCourseDetail(cid),HttpStatus.OK);
	}
	
	@GetMapping("/getAllCourse")
	public List<Courses> getAllCourse(){
		return cs.getAllCourses();
	}
}

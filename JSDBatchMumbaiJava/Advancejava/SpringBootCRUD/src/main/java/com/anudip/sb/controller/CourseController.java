package com.anudip.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.anudip.sb.entity.Courses;
import com.anudip.sb.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService cs;
	
	@GetMapping("/Courses/getcourses")
	public List<Courses> getCourses(){
		return cs.getAllCourses();
	}
	
	@GetMapping("/Courses/getcourses/{cid}")
	public ResponseEntity<Courses> getCourses(@PathVariable("cid") int cid){
		return new ResponseEntity<Courses>(cs.getCourseDetail(cid),HttpStatus.OK);
	}
}

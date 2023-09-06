package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

import jakarta.validation.Valid;

//handle all incoming request of Teacher Entity
@RestController
public class TeacherController {
	
	@Autowired
	TeacherService ts;
	
	@PostMapping("/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@Valid @RequestBody Teacher teacher){
		return new ResponseEntity<Teacher>(ts.addTeacher(teacher),HttpStatus.CREATED);
	}
	
}

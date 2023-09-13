package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> saveTeacher(@Valid @RequestBody Student student){
		return new ResponseEntity<Student>(ss.addStudent(student),HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudent/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") int sid ) {
		return new ResponseEntity<Student>(ss.getStudentDetail(sid),HttpStatus.OK);
	}
	
	@PutMapping("/updateStudent")
	public ResponseEntity<Student> editStudent(@Valid @PathVariable("sid")int sid,@RequestBody Student student){
		return new ResponseEntity<Student>(ss.updateStudentDetail(student, sid),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudent")
	private ResponseEntity<String> removeStudent(@PathVariable ("sid") int sid) {
		ss.deleteStudent(sid);
		return new ResponseEntity<String>("Deleted Successfully.....",HttpStatus.OK);
	}
}

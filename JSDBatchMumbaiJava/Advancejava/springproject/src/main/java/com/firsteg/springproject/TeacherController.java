package com.firsteg.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class TeacherController {
	@Autowired
	TeacherService ts;

	@PostMapping("/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@Valid @RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(ts.addTeacher(teacher), HttpStatus.CREATED);
	}

	@GetMapping("/getTeacher/{tid}")
	public ResponseEntity<Teacher> getTecher(@PathVariable("tid") int tid) {
		return new ResponseEntity<Teacher>(ts.getTeacherDetail(tid), HttpStatus.OK);
	}

	// use put mapping to update the data
	@PutMapping("/editTeacher/{tid}")
	public ResponseEntity<Teacher> editTeacher(@Valid @PathVariable("tid") int tid, @RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(ts.updateTeacherDetail(teacher, tid), HttpStatus.OK);
	}

	@DeleteMapping("/removeTeacher/{tid}")
	public ResponseEntity<String> deleteTeacher(@PathVariable("tid") int tid) {
		ts.deleteTeacherDetail(tid);
		return new ResponseEntity<String>("Deleted Successfully.....", HttpStatus.OK);
	}
}

package com.example.demo.service;

import com.example.demo.entity.Student;

public interface StudentService {
	
	Student addStudent(Student student) ;
	
	Student getStudentDetail(int sid);
	
	Student updateStudentDetail(Student student, int sid);
	
	void deleteStudent(int sid);
}

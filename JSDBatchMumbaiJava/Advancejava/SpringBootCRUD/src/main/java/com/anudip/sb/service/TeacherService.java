package com.anudip.sb.service;

import java.util.List;
import com.anudip.sb.entity.Teacher;

//abstract method for performing CRUD on teacher entity
public interface TeacherService {
	
	//method for saving teacher details in db table
	Teacher addTeacher(Teacher teacher);
	
	//method to fetch teacher detail based on tid from db table
	Teacher getTeacherDetail(int tid);
	
	//method to modify teacher detail based on tid from db table
	Teacher updateTeacherDetail(Teacher teacher, int tid);
	
	//method to remove teacher detail based on tid from db table
	void deleteTeacherDetail(int tid);
	
	//method to fetch teacher detail based on phone number
	Teacher getTeacherByPhone(long tphone);
	
	//method to fetch teacher details based on firstname
	List<Teacher> getTeacherByName(String tname);
	
	//method to fetch teacher details based on first letter of teacher
		List<Teacher> getTeacherdesignation(String designation);
}

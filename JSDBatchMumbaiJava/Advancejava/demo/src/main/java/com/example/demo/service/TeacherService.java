package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Teacher;

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

		Teacher getTeacherByPhone(long tphone);


		List<Teacher> getTeacherByName(String tname);
		
		List<Teacher> getTeacherByDegination(String desination);

}

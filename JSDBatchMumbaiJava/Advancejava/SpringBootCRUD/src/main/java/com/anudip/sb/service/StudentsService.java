package com.anudip.sb.service;

import com.anudip.sb.entity.Students;

public interface StudentsService {
	

	//method for saving Students details in db table
	Students addStudents(Students student);
	
	//method to fetch Students detail based on sid from db table
	Students getStudentsDetail(int sid);
	
	//method to modify Students detail based on sid from db table
	Students updateStudentsDetail(Students student, int sid);
	
	//method to remove Students detail based on sid from db table
	void deleteStudentsDetail(int sid);
	
}

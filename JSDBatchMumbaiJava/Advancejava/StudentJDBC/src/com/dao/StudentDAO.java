package com.dao;
import com.entity.Student;

public interface StudentDAO {
	boolean addStudent(Student student);
	boolean updateStudent();
	boolean  deleteStudent();
	void fetchStudentDetails();
}

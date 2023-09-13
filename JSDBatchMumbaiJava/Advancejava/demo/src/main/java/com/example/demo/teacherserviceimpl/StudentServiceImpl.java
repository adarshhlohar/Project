package com.example.demo.teacherserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.exception.StudentNotFoundexception;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository srepo;
	
	@Override
	public Student addStudent(Student student) {
		return srepo.save(student);
	}

	@Override
	public Student getStudentDetail(int sid) {
		return srepo.findById(sid).orElseThrow(() -> new StudentNotFoundexception("Student Id is not correct"));
	}

	@Override
	public Student updateStudentDetail(Student student, int sid) {
		Student updatedStudent = srepo.findById(sid)
				.orElseThrow(() -> new StudentNotFoundexception("Teacher Id is not correct"));

		// set new values
		updatedStudent.setSeduc(student.getSeduc());
		srepo.save(updatedStudent);
		return updatedStudent;
	}

	@Override
	public void deleteStudent(int sid) {
		srepo.findById(sid).orElseThrow(() -> new StudentNotFoundexception("Teacher Id is not correct"));
		srepo.deleteById(sid);
	}

}

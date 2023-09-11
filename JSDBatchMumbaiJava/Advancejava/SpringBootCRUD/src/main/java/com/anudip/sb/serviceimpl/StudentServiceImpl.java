package com.anudip.sb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.sb.entity.Students;
import com.anudip.sb.exception.StudentIdNotException;
import com.anudip.sb.repository.StudentRepository;
import com.anudip.sb.service.StudentsService;

@Service
public class StudentServiceImpl implements StudentsService{
	
	@Autowired
	StudentRepository srepo;

	@Override
	public Students addStudents(Students student) {
		return srepo.save(student);
	}

	@Override
	public Students getStudentsDetail(int sid) {	
		return srepo.findById(sid).orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));
	}

	@Override
	public Students updateStudentsDetail(Students student, int sid) {
		Students updatedstudent = srepo.findById(sid).orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));

		//set new values
		updatedstudent.setSeduc(student.getSeduc());
		srepo.save(updatedstudent);
		return updatedstudent;
	}

	@Override
	public void deleteStudentsDetail(int sid) {
		srepo.findById(sid).orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));
		srepo.deleteById(sid);
		
	}

}

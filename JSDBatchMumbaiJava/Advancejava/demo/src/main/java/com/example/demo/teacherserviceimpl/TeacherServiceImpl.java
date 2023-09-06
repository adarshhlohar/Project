package com.example.demo.teacherserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.exception.TeacherNotFoundexception;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	TeacherRepository trepo;

	// use save() of Jpa repository for saving details

	@Override
	public Teacher addTeacher(Teacher teacher) {
		return trepo.save(teacher);
	}

	// use findById of Jpa repository for fetching record if not found
	// then throw custom exception

	@Override
	public Teacher getTeacherDetail(int tid) {
		return trepo.findById(tid).orElseThrow(() -> new TeacherNotFoundexception("Teacher Id is not correct"));

	}

	// use findById of Jpa repository for fetching record if not found
	// then throw custom exception
	// if found update phone,designation & save new records

	@Override
	public Teacher updateTeacherDetail(Teacher teacher, int tid) {
		Teacher updatedTeacher = trepo.findById(tid)
				.orElseThrow(() -> new TeacherNotFoundexception("Teacher Id is not correct"));

		// set new values
		updatedTeacher.setTphone(teacher.getTphone());
		updatedTeacher.setDesignation(teacher.getDesignation());

		trepo.save(updatedTeacher); // saving updated details
		return updatedTeacher;

	}

	@Override
	public void deleteTeacherDetail(int tid) {
		trepo.findById(tid).orElseThrow(() -> new TeacherNotFoundexception("Teacher Id is not correct"));
		trepo.deleteById(tid);
	}

}

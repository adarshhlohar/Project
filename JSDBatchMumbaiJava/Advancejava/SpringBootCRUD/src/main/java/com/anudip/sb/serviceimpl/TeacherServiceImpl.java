package com.anudip.sb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.sb.entity.Teacher;
import com.anudip.sb.exception.TeacherIdNotFoundException;
import com.anudip.sb.repository.TeacherRepository;
import com.anudip.sb.service.TeacherService;

//business logic(CRUD Implementation) of entity teacher
@Service
public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	TeacherRepository trepo;

	//use save() of Jpa repository for saving details
	@Override
	public Teacher addTeacher(Teacher teacher) {
		
		return trepo.save(teacher);
	}
	
    //use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	@Override
	public Teacher getTeacherDetail(int tid) {
		return trepo.findById(tid).
         orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));
	}
	
	//use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	// if found update phone,designation & save new records
	@Override
	public Teacher updateTeacherDetail(Teacher teacher, int tid) {
	Teacher updatedTeacher = trepo.findById(tid).
	         orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));

	//set new values
	updatedTeacher.setTphone(teacher.getTphone());
	updatedTeacher.setDesignation(teacher.getDesignation());
	
	trepo.save(updatedTeacher); //saving updated details 
		return updatedTeacher; 
	}


	//use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	//if found use deleteById to remove record
	@Override
	public void deleteTeacherDetail(int tid) {
		trepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));
	    trepo.deleteById(tid);
	}

	//use findTeacherByPhone of Teacher repository for fetching record
	@Override
	public Teacher getTeacherByPhone(long tphone) {
		// TODO Auto-generated method stub
		return trepo.findTeacherByPhone(tphone);
	}

	//use findTeacherByName of Teacher repository for fetching record
	@Override
	public List<Teacher> getTeacherByName(String tname) {
		// TODO Auto-generated method stub
		return trepo.findTeacherByName(tname);
	}

	@Override
	public List<Teacher> getTeacherdesignation(String designation) {		
		return trepo.findTeacherDesignation(designation);
	}

	

}

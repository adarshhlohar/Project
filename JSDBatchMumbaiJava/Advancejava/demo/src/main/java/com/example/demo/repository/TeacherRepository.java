package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	
	@Query("Select t from Teacher t where t.tphone=?1")
	Teacher findTeacherByPhone(long tphone);
	
	@Query("Select t from Teacher t where t.tname=?1")
	List<Teacher> findTeacherByName(String tname);
	
	@Query("Select t from Teacher t where t.designation like ?1% order by tname")
	List<Teacher> findTeacherByDegisnation(String Designation);
}



package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}

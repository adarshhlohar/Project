package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Integer>{

}

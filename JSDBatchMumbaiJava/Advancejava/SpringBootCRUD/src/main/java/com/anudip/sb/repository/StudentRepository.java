package com.anudip.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.sb.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Integer>{

}

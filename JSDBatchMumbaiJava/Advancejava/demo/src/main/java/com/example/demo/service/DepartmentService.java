package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {
	
	Department getDeptDetail(int did);
	List<Department> getAllDept();
	Department updateDeptDetail(Department department, int did);
	
}

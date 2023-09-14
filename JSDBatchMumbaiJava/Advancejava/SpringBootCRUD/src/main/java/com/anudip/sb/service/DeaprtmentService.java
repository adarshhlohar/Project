package com.anudip.sb.service;

import java.util.List;

import com.anudip.sb.entity.Department;

public interface DeaprtmentService {
	
	Department getDeptDetail(int did);
	
	List<Department> getAllDept();
		
	Department updateDeptDetail(Department department, int did);
}

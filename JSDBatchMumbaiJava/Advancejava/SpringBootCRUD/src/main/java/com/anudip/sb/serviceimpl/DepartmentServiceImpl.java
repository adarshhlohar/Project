package com.anudip.sb.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.sb.entity.Department;
import com.anudip.sb.exception.DeptartmentIdNotFoundException;
import com.anudip.sb.repository.DepartmentRepository;
import com.anudip.sb.service.DeaprtmentService;

@Service
public class DepartmentServiceImpl implements DeaprtmentService{
	
	@Autowired
	DepartmentRepository drepo;

	@Override
	public Department getDeptDetail(int did) {
		return drepo.findById(did).orElseThrow(()-> new DeptartmentIdNotFoundException("Incorrect Department id"));
	}

	@Override
	public Department updateDeptDetail(Department department, int did) {
		Department newDept = drepo.findById(did).orElseThrow(()-> new DeptartmentIdNotFoundException("Incorrect Department id"));
		
		newDept.setOnOfEmpl(department.getOnOfEmpl());
		newDept.setDeptHOD(department.getDeptHOD());
		
		drepo.save(newDept);
		return newDept;
	}

	@Override
	public List<Department> getAllDept() {
	
		return drepo.findAll();
	}

}


package com.example.demo.teacherserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.exception.DeptartmentIdNotFoundException;
import com.example.demo.repository.DeparmentRepository;
import com.example.demo.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DeparmentRepository drepo;
	@Override
	public Department getDeptDetail(int did) {
		return  drepo.findById(did).orElseThrow(()-> new DeptartmentIdNotFoundException("Incorrect Department id"));
	}

	@Override
	public List<Department> getAllDept() {
		return drepo.findAll();
	}

	@Override
	public Department updateDeptDetail(Department department, int did) {
		Department newDept = drepo.findById(did).orElseThrow(()->new DeptartmentIdNotFoundException("Incorrect Department Id"));
		
		newDept.setNoOfEmpl(department.getNoOfEmpl());
		newDept.setDeptHOD(department.getDeptHOD());
		drepo.save(newDept);
		return newDept;
	}

}

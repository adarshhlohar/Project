package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService ds;

	@GetMapping("/getDeptDetail/{did}")
	public ResponseEntity<Department> getDept(@PathVariable("did") int did) {
		return new ResponseEntity<Department>(ds.getDeptDetail(did), HttpStatus.OK);
	}

	@GetMapping("/getAllDeptDetail")
	public List<Department> getAllDept() {
		return ds.getAllDept();
	}

	@PutMapping("/updateDeptDetail/{did}")
	public ResponseEntity<Department> updateDetail(@Valid  @PathVariable("did") int did,@RequestBody Department department ){
		return new ResponseEntity<Department>(ds.updateDeptDetail(department, did),HttpStatus.OK); 
	}
}

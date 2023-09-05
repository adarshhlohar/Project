package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


public class Teacher {
	@Id
	private int tid;
	
	@Column(length = 50,nullable = true)
	@NotBlank
	private String tname;
	
	@Column(length = 50,nullable = true)
	private String tsurname;
	
	@Column(length = 50,nullable = true,unique = true)
	private String temail;
	
	@Column(length = 50,nullable = true, unique = true)
	private long tphone;
	
	@Column(length = 50,nullable = true)
	private String designation;
	
}

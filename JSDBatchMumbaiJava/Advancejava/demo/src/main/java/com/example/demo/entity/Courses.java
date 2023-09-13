package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name="CourseInfo")
@Data
public class Courses {
	@Id
	private int cid;
	
	@Column(length=20, nullable = true)
	@NotBlank(message = "Course Name cannot be blank")
	private String courseName;
	
	@Column(length=8, nullable = true)
	@NotBlank(message = "Duration cannot be blank")
	private String duration;
	
	@Column(length=10, nullable = true)
	@NotNull(message = "Fees cannot be blank")
	private double courseFees;
}

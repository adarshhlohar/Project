package com.anudip.sb.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
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
	
	@OneToOne(mappedBy = "course",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonManagedReference
	private Students student;

}

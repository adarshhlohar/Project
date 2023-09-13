package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="DeparmentInfo")
public class Department {
	@Id
	private int did;
	
	@Column(length=20, nullable = true)
	@NotBlank(message = "Department Name cannot be blank")
	private String deptName;
	
	@Column(length=20)
	private String deptHOD;
	
	@Column(length=40, nullable = true)
	@NotNull(message = "kindly mention no of employess")
	private int noOfEmpl;
	
	@OneToMany(mappedBy = "department" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Teacher> teacher;
}

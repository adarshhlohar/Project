package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENTINFO")
public class Student {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	
	@Column(length=25, nullable = false, unique = true)
	@NotBlank(message = "Student Name cannot be blank")
	private String sfname;
	
	@Column(length = 25)
	private String slname;
	
	@Column(length=25, nullable = false, unique = true)
	private long sphone;
	
	@Column(length=25, nullable = false, unique = true)
	@NotBlank(message = "Student Email cannot be blank")
	@Email(message = "Email is incorrect")
	private String semail;
	
	@Column(length=20, nullable = false)
	@NotBlank(message = "Student Education cannot be blank")
	private String seduc;
	
	@Column(length=50, nullable = false)
	@NotBlank(message = "Student Address cannot be blank")
	private String saddr;
}

package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Table
@Entity
@Data
public class Batches {
	@Id
	private int bid;
	
	@Column(length = 20, nullable = true)
	@NotBlank(message = "Batch name cannot be blank")
	private String bname;
	
	@Column(length = 20, nullable = true)
	@NotBlank(message = "Batch subject cannot be blank")
	private String subject;
	
	@Column(length = 20, nullable = true)
	@NotBlank(message = "Batch start date cannot be blank")
	private String startdate;
	
	@Column(length = 10)
	private String enddate;
	
	@Column(length = 20, nullable = true)
	@NotNull(message = "The duration cannot be null")
	private int duration;
}

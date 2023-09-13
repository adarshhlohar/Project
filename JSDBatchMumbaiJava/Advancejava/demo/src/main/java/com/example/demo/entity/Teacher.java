package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	@Id
	private int tid;
	
	@Column(length = 50,nullable = false)
	@NotBlank(message = "Trainer name cannot be null")
	private String tname;
	
	@Column(length = 50,nullable = true)
	@NotBlank(message = "Trainer surname  cannot be null")
	private String tsurname;
	
	@Column(length = 50,nullable = false,unique = true)
	@Email
	@NotBlank(message = "This is not a Email")
	private String temail;
	
	@Column(length = 50,nullable = false, unique = true)
	@NotNull(message = "Trainer phone cannot be null")
	private long tphone;
	
	@Column(length = 50,nullable = false)
	@NotBlank(message = "Trainer designation cannot be null")
	private String designation;

	@ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name = "deptId" , referencedColumnName = "did")
	private Department department;
	
}

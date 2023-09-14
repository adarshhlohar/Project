package com.anudip.sb.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Teacher entity with all parameter
@Entity
@Table(name="TrainersInfo")

@Data //Getter & Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
	
	@Id
	private int tid;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Trainer Name cannot be blank")
	private String tname;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Trainer Surname cannot be blank")
	private String tsurname;
	
	@Column(length=20, nullable = false, unique = true)
	@NotBlank(message = "Trainer Email ID cannot be blank")
	@Email(message="Email id is not proper")
	private String temail;
	
	@Column(length=11, nullable = false, unique=true)
	@NotNull(message = "Phone number cannot be null")
	private long tphone;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Designation cannot be blank")
	private String designation;

	@OneToMany(mappedBy = "teacher", 
     fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Batches> batchDetails;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="deptID", referencedColumnName = "did")
	@JsonBackReference
	private Department department;
}







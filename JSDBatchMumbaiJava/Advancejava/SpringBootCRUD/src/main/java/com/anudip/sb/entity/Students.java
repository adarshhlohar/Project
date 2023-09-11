package com.anudip.sb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="StudentsInfo")
@Data //Getter & Setter
@NoArgsConstructor
@AllArgsConstructor
public class Students {
	
	@Id
	private int sid;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Student Name cannot be blank")
	private String sfname;
	
	@Column(length=25)
	private String slname;
	
	@Column(length=25, nullable = false, unique = true)
	@NotNull(message = "Student phone cannot be null")
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

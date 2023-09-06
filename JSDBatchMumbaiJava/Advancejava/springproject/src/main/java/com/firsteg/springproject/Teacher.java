package com.firsteg.springproject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
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
	@NotBlank(message = "Trainer Email cannot be null")
	private String temail;
	
	@Column(length = 50,nullable = false, unique = true)
	@NotNull(message = "Trainer phone cannot be null")
	private long tphone;
	
	@Column(length = 50,nullable = false)
	@NotBlank(message = "Trainer designation cannot be null")
	private String designation;

	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsurname() {
		return tsurname;
	}

	public void setTsurname(String tsurname) {
		this.tsurname = tsurname;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public long getTphone() {
		return tphone;
	}

	public void setTphone(long tphone) {
		this.tphone = tphone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}

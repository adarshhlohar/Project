package com.anudip.sb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Batches {

	@Id
	private int bid;
	
	private String bname;
	
	private String subject;
	
	private String startdate;
	
	private String enddate;
	
	private int duration;
	
	@ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="TeacherId", referencedColumnName = "tid")
	@JsonBackReference
	private Teacher teacher;
}

package com.Anudip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // marks class as entity
@Table(name = "EmpDetails")  //specifies the table name
public class Employee {
	
	@Id  //marks it as identifier for this entity it as a primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //auto icreamnent
	private int empId;
	
	// column mention colname,length,null unique
	
	@Column(name="FirstName", length=30,nullable = false)
	private String empName;
	
	@Column(length=30)
	private String empSurname;
	
	@Column(length=11,nullable= false,unique = true)
	private long empPhone;
	
	@Column(length = 40)
	private String empAddr;
	
	@Column(length = 20,nullable = false)
	private String designation;
	
	public Employee(String empName, String empSurname, long empPhone, String empAddr, String designation) {
		super();
		this.empName = empName;
		this.empSurname = empSurname;
		this.empPhone = empPhone;
		this.empAddr = empAddr;
		this.designation = designation;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpSurname() {
		return empSurname;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public String getDesignation() {
		return designation;
	}
	
	
}

 package com.anudip.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "cust_details")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "customer name cannot be blank")
	@Min(value = 3)
	private String cname;
	
	@Column(length = 50, nullable = false)
	@NotBlank(message = "address cannot be blank")
	private String addr;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "customer email cannot be blank")
	@Email(message = "Incorrect email id")
	private String email;
	
	@Column(length = 11, nullable = false, unique = true)
	@NotNull(message = "customer phone cannot be blank")
	private long phone;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}

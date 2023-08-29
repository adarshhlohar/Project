package com.entity;

public class Student {
	private int sid;
	private String sname;
	private String saddr;
	private String semail;
	private long sphone;
	private String seduc;
	
	
	public Student(int sid, String sname, String saddr, String semail, long sphone, String seduc) {
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.semail = semail;
		this.sphone = sphone;
		this.seduc = seduc;
	}
	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public String getSemail() {
		return semail;
	}

	public long getSphone() {
		return sphone;
	}

	public String getSeduc() {
		return seduc;
	}
	
}

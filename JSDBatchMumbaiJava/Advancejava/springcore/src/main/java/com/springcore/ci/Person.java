package com.springcore.ci;

public class Person {
	private String name;
	private int pid;
	private Certi certi;
	public Person(String name, int pid,Certi certi) {
		super();
		this.name = name;
		this.pid = pid;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + "Certi name"+certi.getName() + "]";
	}
	
	
	
}

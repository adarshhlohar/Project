package com.example.demo.exception;

public class DeptartmentIdNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DeptartmentIdNotFoundException(String massage) {
		super(massage);
	}

}

package com.example.demo.exception;

public class StudentNotFoundexception extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public StudentNotFoundexception(String message) {
		super(message);
		
	}
	
}

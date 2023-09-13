package com.example.demo.exception;

public class CourseIdNotFindException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CourseIdNotFindException(String message) {
		super(message);
	}
}

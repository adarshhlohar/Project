package com.example.demo.exception;

public class BatchNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public BatchNotFoundException(String message) {
		super(message);
	}
}

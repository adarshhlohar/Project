package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(TeacherNotFoundexception.class)
	public ResponseEntity<ErrorMessage> handleTeacherException
	(TeacherNotFoundexception ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
//	for student Exception handler
	@ExceptionHandler(StudentNotFoundexception.class)
	public ResponseEntity<ErrorMessage> handleStudentException
	(StudentNotFoundexception ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}

//	for Department Exception handler
	@ExceptionHandler(DeptartmentIdNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleStudentException
	(DeptartmentIdNotFoundException ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(CourseIdNotFindException.class)
	public ResponseEntity<ErrorMessage> handleStudentException
	(CourseIdNotFindException ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
//	BatchNotFoundException
	@ExceptionHandler(BatchNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleStudentException
	(BatchNotFoundException ex, WebRequest request){
		ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
}

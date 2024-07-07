package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class GlobalExceptionhandler extends ResponseEntityExceptionHandler {

	public ResponseEntity<Errormessage> handleStudentNotFoundException(StudentNotFoundException ex,WebRequest request){
		
		
		Errormessage errormessage=new Errormessage(HttpStatus.NOT_FOUND,ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errormessage);
	}
	
}

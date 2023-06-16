package com.skillstorm.training.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


// AOP = Aspect Oriented Programming (separate the error handling from the implementation code)
@RestControllerAdvice // convenience annotation for @ControllerAdvice and @ResponseBody
public class GlobalExceptionHandler {
	// Like a Spider this ExceptionHandler will hover above our program 
	// and swoop in
	// to grab the HttpResponse message and change it when an Error is thrown
	
   /*
  / _ \
\_\(_)/_/
 _//o\\_ 
  /   \ 
*/
	// Aspect Oriented Programming -- A watcher that swoops in and steals control of the program
	
	/*
	 * Annotations to know:
	 * @RestControllerAdvice
	 * @ResponseStatus(code = HttpStatus.BAD_REQUEST) etc.
	 * @ExceptionHandler(com.skilltorm.training.exceptions.MyCustomException) etc.
	 */
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public String handleValidationIssue(Exception e) {
		// Think about how much of your implementation details you want to make public
		String message = e.getMessage();
		int index = message.indexOf("DefaultMessage");
		return message.substring(index);
	}
	

}

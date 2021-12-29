package com.hotel.Roomservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mongodb.MongoSocketReadTimeoutException;
import com.mongodb.MongoWriteException;

@RestControllerAdvice
public class ControllerExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MongoSocketReadTimeoutException.class)
	public String handleMongoSocketTimeout(MongoSocketReadTimeoutException e){
		return "Invalid Argument";
				
	}

	

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public String handleInvalidArguments(HttpMessageNotReadableException e){
		return "Invalid Argument";
				
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MongoWriteException.class)
	public String handleMongoWriteException(MongoWriteException e){
		return "Invalid Argument";
				
	}
	
	

}

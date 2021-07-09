package com.lata.springmvcdemo.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lata.springmvcdemo.respentities.ErrorInfo;


@RestControllerAdvice
public class GlobalExceptionHandler {
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<ErrorInfo> handleException(Exception ex, HttpServletRequest req) {
			return new ResponseEntity<>(new ErrorInfo(HttpStatus.NOT_FOUND,404,ex.getMessage(),req.getRequestURI()),HttpStatus.NOT_FOUND);  
	    }

}

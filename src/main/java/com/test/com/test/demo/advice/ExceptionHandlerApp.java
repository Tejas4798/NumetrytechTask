package com.test.com.test.demo.advice;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerApp {
	
    @ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String> ExceptionHandler(MethodArgumentNotValidException exception)
    {
          Map<String,String> errormap=new HashMap<>();
           FieldError error=exception.getBindingResult().getFieldError();
           errormap.put(error.getField(), error.getDefaultMessage());
           return errormap;
    }
}

package com.example.spring.springrest.api;

import java.util.Date;

import com.example.spring.springrest.exceptionhandler.ApiError;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ApiError> handleGeException(Exception ex, WebRequest req) {
        ApiError aerror = new ApiError();

        aerror.setId(System.currentTimeMillis() + "");
        aerror.setErrorcode("GEEH001");
        aerror.setMsg(ex.toString().concat(":-------> Contact developer"));
        aerror.setCategory("General Exception");
        aerror.setDt(new Date());
        ex.printStackTrace();

        return new ResponseEntity<ApiError>(aerror,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<ApiError> handleRtException(RuntimeException ex, WebRequest req) {
        ApiError aerror = new ApiError();

        aerror.setId(System.currentTimeMillis() + "");
        aerror.setErrorcode("GEEH002");
        aerror.setMsg("Error Occured, -------> Contact developer");
        aerror.setCategory("General Exception");
        aerror.setDt(new Date());
        ex.printStackTrace();

        return new ResponseEntity<ApiError>(aerror,HttpStatus.BAD_REQUEST);
    }

}

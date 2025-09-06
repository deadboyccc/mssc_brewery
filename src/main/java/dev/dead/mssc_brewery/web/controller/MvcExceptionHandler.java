package dev.dead.mssc_brewery.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class MvcExceptionHandler {
  @ExceptionHandler(ConstraintViolationException.class)
  public ResponseEntity<List<String>> validationErrorHandler(ConstraintViolationException e) {

    List<String> errors = new ArrayList<>(e.getConstraintViolations().size());
    e.getConstraintViolations().forEach(constraintViolation -> {
      errors.add(constraintViolation.getPropertyPath() + " : " + constraintViolation.getMessage());
    });
    return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);

  }

  @ExceptionHandler(BindException.class)
  public ResponseEntity<List<Object>> bindExceptionHandler(BindException ex) {
    List<Object> errors = new ArrayList<>(ex.getAllErrors());
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
  }

}

package com.projet.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler({EntityNotFoundException.class})
   public ResponseEntity<ErrorCodes>entityNotFoundException(EntityNotFoundException ex){
      return new ResponseEntity<>(new ErrorCodes(401,ex.getMessage()),HttpStatus.UNAUTHORIZED);
   } 
}

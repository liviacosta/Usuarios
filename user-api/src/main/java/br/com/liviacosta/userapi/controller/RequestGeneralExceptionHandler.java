package br.com.liviacosta.userapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.liviacosta.userapi.exception.BadRequestException;


@ControllerAdvice
public class RequestGeneralExceptionHandler {

  @ExceptionHandler(BadRequestException.class)
  private ResponseEntity<Object> handleBadRequest(BadRequestException exception) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
        .body(exception.getMessage());
  }
}
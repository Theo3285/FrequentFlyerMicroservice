package com.frequentflyer.controller;

import com.frequentflyer.controller.exception.AccountExpiredException;
import com.frequentflyer.controller.exception.UnauthorizedMemberException;
import com.frequentflyer.controller.exception.UnknownMemberException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerControllerAdvice {

    @ExceptionHandler(UnknownMemberException.class)
    public ResponseEntity<String> handleUnkownMemberException(UnknownMemberException ex) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(UnauthorizedMemberException.class)
    public ResponseEntity<String> handleUnauthorizedMemberException(UnauthorizedMemberException ex) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(AccountExpiredException.class)
    public ResponseEntity<String> handleAccountExpiredException(AccountExpiredException ex) {
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

}

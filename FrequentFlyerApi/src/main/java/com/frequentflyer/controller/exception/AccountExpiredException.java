package com.frequentflyer.controller.exception;

public class AccountExpiredException extends RuntimeException {
    public AccountExpiredException(String message) {
        super(message);
    }
}

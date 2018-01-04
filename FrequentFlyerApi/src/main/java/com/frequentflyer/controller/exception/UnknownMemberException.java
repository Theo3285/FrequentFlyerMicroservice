package com.frequentflyer.controller.exception;

public class UnknownMemberException extends RuntimeException {
    public UnknownMemberException(String message) {
        super(message);
    }
}

package com.thefisola.patterns.behavioral.chain.of.responsibility.exception;

public class InActiveAccountException extends RuntimeException {
    public InActiveAccountException(String message) {
        super(message);
    }
}

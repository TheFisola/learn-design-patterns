package com.thefisola.patterns.behavioral.chain.of.responsibility.exception;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

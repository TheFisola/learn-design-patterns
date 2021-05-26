package com.thefisola.patterns.behavioral.chain.of.responsibility.exception;

public class WrongKycLevelException extends RuntimeException {
    public WrongKycLevelException(String message) {
        super(message);
    }
}

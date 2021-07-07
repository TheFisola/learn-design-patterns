package com.thefisola.patterns.behavioral.chain.of.responsibility.model;

import java.util.UUID;

public class TransactionRequest {
    private final String reference = UUID.randomUUID().toString();
    private long amount;
    private String senderId;
    private String receiverId;
    // validation states
    private boolean validBalance = false;
    private boolean validKycLevel = false;
    private boolean validAccountState = false;

    public boolean isValidBalance() {
        return validBalance;
    }

    public void setValidBalance(boolean validBalance) {
        this.validBalance = validBalance;
    }

    public boolean isValidKycLevel() {
        return validKycLevel;
    }

    public void setValidKycLevel(boolean validKycLevel) {
        this.validKycLevel = validKycLevel;
    }

    public boolean isValidAccountState() {
        return validAccountState;
    }

    public void setValidAccountState(boolean validAccountState) {
        this.validAccountState = validAccountState;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
}

package com.thefisola.patterns.behavioral.chain.of.responsibility.chain.handlers;

import com.thefisola.patterns.behavioral.chain.of.responsibility.chain.WalletTransferValidationChain;
import com.thefisola.patterns.behavioral.chain.of.responsibility.exception.InsufficientFundsException;
import com.thefisola.patterns.behavioral.chain.of.responsibility.model.TransactionRequest;

public class BalanceValidationHandler implements WalletTransferValidationChain {

    private WalletTransferValidationChain walletTransferValidationChain;

    @Override
    public WalletTransferValidationChain nextChain(WalletTransferValidationChain walletTransferValidationChain) {
        this.walletTransferValidationChain = walletTransferValidationChain;
        return this.walletTransferValidationChain;
    }

    @Override
    public void process(TransactionRequest request) {
        long mockWalletBalance = 30000;
        if(request.getAmount() > mockWalletBalance) throw new InsufficientFundsException("Insufficient Funds");
        System.out.println("Balance validation passed....");
        request.setValidBalance(true);
        walletTransferValidationChain.process(request);
    }
}

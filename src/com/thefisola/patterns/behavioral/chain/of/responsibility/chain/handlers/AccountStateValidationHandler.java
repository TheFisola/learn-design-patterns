package com.thefisola.patterns.behavioral.chain.of.responsibility.chain.handlers;

import com.thefisola.patterns.behavioral.chain.of.responsibility.chain.WalletTransferValidationChain;
import com.thefisola.patterns.behavioral.chain.of.responsibility.exception.InActiveAccountException;
import com.thefisola.patterns.behavioral.chain.of.responsibility.model.TransactionRequest;

public class AccountStateValidationHandler implements WalletTransferValidationChain {

    private WalletTransferValidationChain walletTransferValidationChain;

    @Override
    public WalletTransferValidationChain nextChain(WalletTransferValidationChain walletTransferValidationChain) {
        this.walletTransferValidationChain = walletTransferValidationChain;
        return this.walletTransferValidationChain;
    }

    @Override
    public void process(TransactionRequest request) {

        if (request.isValidBalance()) {
            String mockAccountState = "active";
            if (!mockAccountState.equals("active")) throw new InActiveAccountException("Inactive account");
            System.out.println("Account state validation passed....");
            request.setValidAccountState(true);
        }

        this.walletTransferValidationChain.process(request);
    }
}

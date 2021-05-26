package com.thefisola.patterns.behavioral.chain.of.responsibility;

import com.thefisola.patterns.behavioral.chain.of.responsibility.chain.WalletTransferValidationChain;
import com.thefisola.patterns.behavioral.chain.of.responsibility.chain.handlers.AccountStateValidationHandler;
import com.thefisola.patterns.behavioral.chain.of.responsibility.chain.handlers.BalanceValidationHandler;
import com.thefisola.patterns.behavioral.chain.of.responsibility.chain.handlers.KycLevelValidationHandler;
import com.thefisola.patterns.behavioral.chain.of.responsibility.model.TransactionRequest;

public class Main {

    public static void main(String[] args) {
        TransactionRequest transactionRequest = new TransactionRequest();
        transactionRequest.setAmount(200);
        transactionRequest.setReceiverId("010232434");
        transactionRequest.setSenderId("308493434");

        WalletTransferValidationChain balanceValidation = new BalanceValidationHandler();
        WalletTransferValidationChain accountStateValidation = new AccountStateValidationHandler();
        WalletTransferValidationChain kycLevelValidation = new KycLevelValidationHandler();

        balanceValidation
                .nextChain(accountStateValidation)
                .nextChain(kycLevelValidation);

        // Starts and runs through the full chain in order/sequence
        balanceValidation.process(transactionRequest);

    }
}

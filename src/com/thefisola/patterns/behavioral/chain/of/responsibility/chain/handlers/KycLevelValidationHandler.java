package com.thefisola.patterns.behavioral.chain.of.responsibility.chain.handlers;

import com.thefisola.patterns.behavioral.chain.of.responsibility.chain.WalletTransferValidationChain;
import com.thefisola.patterns.behavioral.chain.of.responsibility.exception.WrongKycLevelException;
import com.thefisola.patterns.behavioral.chain.of.responsibility.model.TransactionRequest;

public class KycLevelValidationHandler implements WalletTransferValidationChain {

    private WalletTransferValidationChain walletTransferValidationChain;

    @Override
    public WalletTransferValidationChain nextChain(WalletTransferValidationChain walletTransferValidationChain) {
        this.walletTransferValidationChain = walletTransferValidationChain;
        return this.walletTransferValidationChain;
    }

    @Override
    public void process(TransactionRequest request) {
        if (request.isValidAccountState()) {
            int mockKycLevel = 4;

            if (mockKycLevel < 4) throw new WrongKycLevelException("Inactive account");

            System.out.println("Kyc level validation passed....");
            request.setValidKycLevel(true);
        }
    }
}

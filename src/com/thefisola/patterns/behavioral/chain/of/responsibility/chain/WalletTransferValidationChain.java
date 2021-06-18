package com.thefisola.patterns.behavioral.chain.of.responsibility.chain;

import com.thefisola.patterns.behavioral.chain.of.responsibility.model.TransactionRequest;

public interface WalletTransferValidationChain {
    WalletTransferValidationChain nextChain(WalletTransferValidationChain walletTransferValidationChain);

    void process(TransactionRequest request);
}

package com.sk.InventoryMgmtSystem.services;

import com.sk.InventoryMgmtSystem.dtos.Response;
import com.sk.InventoryMgmtSystem.dtos.TransactionRequest;
import com.sk.InventoryMgmtSystem.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}

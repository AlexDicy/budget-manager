package com.dicydev.university.pa.budgetmanager;

import com.dicydev.university.pa.budgetmanager.transaction.Transaction;

/**
 * Transactions in the ledger are linked to a specific account.
 */
public interface Account {
    double getBalance();

    void addTransaction(Transaction transaction);
}

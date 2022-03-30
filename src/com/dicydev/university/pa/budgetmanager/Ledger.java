package com.dicydev.university.pa.budgetmanager;

import com.dicydev.university.pa.budgetmanager.transaction.Transaction;

import java.util.List;

public interface Ledger {
    void add(Account account, Transaction t);

    List<Transaction> getTransactions();

    List<Transaction> getTransactionsFor(Account account);
}

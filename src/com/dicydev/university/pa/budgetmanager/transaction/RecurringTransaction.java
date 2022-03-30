package com.dicydev.university.pa.budgetmanager.transaction;

import com.dicydev.university.pa.budgetmanager.transaction.Transaction;

public interface RecurringTransaction extends Transaction {
    int getFrequency();
}

package com.dicydev.university.pa.budgetmanager.transaction;

import java.util.Date;

/**
 * Represents an income or an expense.
 */
public interface Transaction {
    TransactionType getType();

    TransactionCategory getCategory();

    double getAmount();

    String getDescription();

    Date getDate();
}

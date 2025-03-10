package application;

import dao.*;
import entity.*;

public class TransactionApp {
    TransactionDao transactionDao = new TransactionDao();
    
    public Transaction getTransaction(int id){
        Transaction transaction = transactionDao.find(id);
        return transaction;
    }

    public Transaction setTransaction(String transactionDate, String fromCurrency, String toCurrency, double amount, double totalAmount){
        Transaction transaction = new Transaction(transactionDate, fromCurrency, toCurrency, amount, totalAmount);
        transactionDao.persist(transaction);
        return transaction;
    }
}

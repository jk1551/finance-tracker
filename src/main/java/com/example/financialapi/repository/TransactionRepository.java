package com.example.financialapi.repository;

import com.example.financialapi.model.MutableTransaction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class TransactionRepository {

    List<MutableTransaction> transactions = new ArrayList<>();
    public TransactionRepository() {
        transactions.add(
                new MutableTransaction(UUID.randomUUID().toString(), "Best Buy", 19.99, "A Tv")
        );
        transactions.add(
                new MutableTransaction(UUID.randomUUID().toString(), "Target", 23.99, "Some shoes")
        );
    }

    // Find All Transactions
    public List<MutableTransaction> findAll(){
        return transactions;
    }

    // Create a Transaction
    public MutableTransaction create(MutableTransaction transaction){
        transactions.add(transaction);
        return transaction;
    }

    // Find by Id
    public MutableTransaction findById(String id){
        return transactions.stream().filter(transaction -> transaction.id().equals(id)).findFirst().orElse(null);
    }
}

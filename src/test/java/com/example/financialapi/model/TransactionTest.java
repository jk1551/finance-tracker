package com.example.financialapi.model;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.springframework.test.util.AssertionErrors.assertNotNull;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class TransactionTest {

    @Test
    void create_new_mutable_transaction() {
        MutableTransaction transaction = new MutableTransaction(UUID.randomUUID().toString(), "Best Buy", 19.99, "A Tv");

        transaction.setId(UUID.randomUUID().toString());
        transaction.setTitle("Panera Bread");
        transaction.setAmount(10.99);
        transaction.setDescription("Lunch at panera");

        assertNotNull("Transaction not empty", transaction);
        assertEquals("We expect panera bread", "Panera Bread", transaction.getTitle());
    }
}

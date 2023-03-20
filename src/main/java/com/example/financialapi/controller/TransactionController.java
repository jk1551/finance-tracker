package com.example.financialapi.controller;

import com.example.financialapi.model.MutableTransaction;
import com.example.financialapi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionRepository repository;

    public TransactionController(TransactionRepository repository){
        this.repository = repository;
    }

    // Get all transactions
    @GetMapping()
    public List<MutableTransaction> getAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public MutableTransaction findById(@PathVariable String id){
        return repository.findById(id);
    }

}

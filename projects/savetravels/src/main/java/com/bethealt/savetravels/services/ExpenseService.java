package com.bethealt.savetravels.services;
import com.bethealt.savetravels.models.*;
import com.bethealt.savetravels.repositories.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ExpenseService {

    @Autowired
    ExpenseRepository expenseRepository;

    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        }
        else {
            return null;
        }
    }
    
}

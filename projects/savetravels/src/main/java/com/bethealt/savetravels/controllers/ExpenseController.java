package com.bethealt.savetravels.controllers;
import com.bethealt.savetravels.services.*;
import com.bethealt.savetravels.models.*;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @GetMapping("/")
    public String index() {
        return "redirect:/expenses";
    }

    @GetMapping("/expenses")
    public String newExpense(@ModelAttribute("expense") Expense expense, Model model) {

        List<Expense> expenses = expenseService.allExpenses();
        model.addAttribute("expenses", expenses);

        return "index.jsp";
    }

    @PostMapping("/expenses")
    public String create(@Valid @ModelAttribute("expense") Expense expense,  BindingResult result) {
        if(result.hasErrors()) {
            return "index.jsp";
        }
        else{
            expenseService.createExpense(expense);
            return "redirect:/";
        }
    }
        
}

    


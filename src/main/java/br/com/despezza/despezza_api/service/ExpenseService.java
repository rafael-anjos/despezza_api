package br.com.despezza.despezza_api.service;

import br.com.despezza.despezza_api.model.Expense;
import br.com.despezza.despezza_api.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    //List
    public List<Expense> list() {
        return expenseRepository.findAll();
    }

    //Create
    public Expense create(Expense expense) {
        return expenseRepository.save(expense);
    }

    //Delete
    public void delete(Long id) {
        expenseRepository.deleteById(id);
    }

    //TotalExpense
    public Double totalExpense() {
       return expenseRepository.findTotalExpense();
    }
}

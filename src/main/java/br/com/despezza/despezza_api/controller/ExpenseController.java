package br.com.despezza.despezza_api.controller;

import br.com.despezza.despezza_api.model.Expense;
import br.com.despezza.despezza_api.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public List<Expense> list() {
        return expenseService.list();
    }

    @PostMapping
    public Expense create(@RequestBody Expense expense) {
        return expenseService.create(expense);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        expenseService.delete(id);
    }
}

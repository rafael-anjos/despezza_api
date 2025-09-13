package br.com.despezza.despezza_api.repository;

import br.com.despezza.despezza_api.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository <Expense, Long> {
}

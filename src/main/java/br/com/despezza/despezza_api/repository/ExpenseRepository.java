package br.com.despezza.despezza_api.repository;

import br.com.despezza.despezza_api.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExpenseRepository extends JpaRepository <Expense, Long> {

    @Query(value = "SELECT SUM(value) AS total_expense FROM despezza_dtb.expenses", nativeQuery = true)
    Double findTotalExpense();
}

package br.com.despezza.despezza_api.repository;

import br.com.despezza.despezza_api.model.Revenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RevenueRepository extends JpaRepository <Revenue, Long> {

    @Query(value = "SELECT SUM(value) AS total_revenue FROM despezza_dtb.revenues", nativeQuery = true)
    Double findTotalRevenue();
}


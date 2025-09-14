package br.com.despezza.despezza_api.controller;

import br.com.despezza.despezza_api.model.Revenue;
import br.com.despezza.despezza_api.service.RevenueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/revenues")
public class RevenueController {

    private final RevenueService revenueService;

    public RevenueController(RevenueService revenueService){
        this.revenueService = revenueService;
    }

    @GetMapping("/list")
    public List<Revenue> list(){
        return revenueService.list();
    }

    @GetMapping("/total-revenue")
    public Double totalRevenue() {
        return revenueService.totalRevenue();
    }

    @PostMapping
    public Revenue create(@RequestBody Revenue revenue){
        return revenueService.create(revenue);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        revenueService.delete(id);
    }
}

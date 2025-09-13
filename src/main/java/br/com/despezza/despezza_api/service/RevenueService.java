package br.com.despezza.despezza_api.service;

import br.com.despezza.despezza_api.model.Revenue;
import br.com.despezza.despezza_api.repository.RevenueRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RevenueService {

    private final RevenueRepository revenueRepository;

    public RevenueService(RevenueRepository revenueRepository){
        this.revenueRepository = revenueRepository;
    }

    //List
    public List<Revenue> list(){
        return revenueRepository.findAll();
    }

    //Create
    public Revenue create(Revenue revenue){
        return revenueRepository.save(revenue);
    }

    //Delete
    public void delete(Long id){
        revenueRepository.deleteById(id);
    }

}

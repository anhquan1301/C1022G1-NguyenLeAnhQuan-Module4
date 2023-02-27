package com.example.exercise1.service.iplm;

import com.example.exercise1.model.SandwichCondiment;
import com.example.exercise1.repository.ISandwichRepository;
import com.example.exercise1.repository.iplm.SandwichRepository;
import com.example.exercise1.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SandwichService implements ISandwichService {
    @Autowired
    ISandwichRepository iSandwichRepository;
    @Override
    public List<SandwichCondiment> findAll(String condiment) {
        return iSandwichRepository.findAll(condiment);
    }
}

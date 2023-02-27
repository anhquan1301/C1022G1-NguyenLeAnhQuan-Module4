package com.example.exercise1.service;

import com.example.exercise1.model.SandwichCondiment;

import java.util.List;

public interface ISandwichService {
   List<SandwichCondiment> findAll(String condiment);
}

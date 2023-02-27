package com.example.exercise1.repository;

import com.example.exercise1.model.SandwichCondiment;

import java.util.List;

public interface ISandwichRepository {
    List<SandwichCondiment> findAll(String condiment);
}

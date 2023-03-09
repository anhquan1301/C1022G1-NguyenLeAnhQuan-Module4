package com.example.excercise.service;

import com.example.excercise.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(int id);

}

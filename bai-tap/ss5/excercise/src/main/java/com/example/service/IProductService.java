package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll(String name);
    Product findById(int id);
    void save(Product product);
    void edit(Product product);
    void delete(int id);

}

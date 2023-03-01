package com.example.products.service;

import com.example.products.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findALl(String name);
    Product findById(int id);
    void save(Product product);
    void edit(Product product);
    void delete(int id);
}

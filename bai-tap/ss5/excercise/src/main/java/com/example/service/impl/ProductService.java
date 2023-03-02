package com.example.service.impl;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public List<Product> findAll(String name) {
        return iProductRepository.findAll(name);
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void edit(Product product) {

    }

    @Override
    public void delete(int id) {

    }
}

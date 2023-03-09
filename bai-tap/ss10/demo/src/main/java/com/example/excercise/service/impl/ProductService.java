package com.example.excercise.service.impl;

import com.example.excercise.model.Product;
import com.example.excercise.repository.IProductRepository;
import com.example.excercise.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return iProductRepository.findById(id);
    }
}

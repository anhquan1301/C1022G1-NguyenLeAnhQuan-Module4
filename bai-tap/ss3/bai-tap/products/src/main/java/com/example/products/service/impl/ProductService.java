package com.example.products.service.impl;

import com.example.products.model.Product;
import com.example.products.repository.IProductRepository;
import com.example.products.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findALl(String name) {
        if (name == null) {
            name = "";
        }
        return iProductRepository.findALl(name);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.edit(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }
}

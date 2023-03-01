package com.example.products.repository.impl;

import com.example.products.model.Product;
import com.example.products.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static final List<Product> listProduct = new ArrayList<>();

    static {
        listProduct.add(new Product(1, "Iphone14", "2000", "100% L/A", "Apple"));
        listProduct.add(new Product(2, "Iphone13", "1000", "99% L/A", "Apple"));
        listProduct.add(new Product(3, "Iphone12", "500", "98% L/A", "Apple"));
    }

    @Override
    public List<Product> findALl(String name) {
        List<Product> newList = new ArrayList<>();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().contains(name)) {
                newList.add(listProduct.get(i));
            }
        }
        return newList;
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                return listProduct.get(i);
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        product.setId(listProduct.size()+1);
        listProduct.add(product);
    }

    @Override
    public void edit(Product product) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == product.getId()) {
                listProduct.set(i, product);
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                listProduct.remove(listProduct.get(i));
            }
        }
    }
}

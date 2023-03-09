package com.example.excercise.repository;

import com.example.excercise.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}

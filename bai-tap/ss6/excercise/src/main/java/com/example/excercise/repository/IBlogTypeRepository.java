package com.example.excercise.repository;

import com.example.excercise.model.BlogType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogTypeRepository extends JpaRepository<BlogType,Integer> {
    @Override
    List<BlogType> findAll();
}

package com.example.excercise.service;

import com.example.excercise.model.Blog;
import com.example.excercise.model.BlogType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(String tittle,Pageable pageable);
    Blog findById(int id);
    void save(Blog blog);
    void edit(Blog blog);
    void delete(int id);
//    Page<Blog> findByTittleContainingOrderById(String tittle, Pageable pageable);
}

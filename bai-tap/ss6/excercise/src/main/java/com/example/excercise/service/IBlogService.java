package com.example.excercise.service;

import com.example.excercise.model.Blog;
import com.example.excercise.model.BlogType;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll(String tittle);
    Blog findById(int id);
    void save(Blog blog);
    void edit(Blog blog);
    void delete(int id);

}

package com.example.excercise.service;

import com.example.excercise.model.BlogType;

import java.util.List;

public interface IBlogTypeService {

    List<BlogType> findByName(String name);
    void save(BlogType blogType);
}

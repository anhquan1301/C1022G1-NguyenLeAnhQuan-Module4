package com.example.webservice.service;

import com.example.webservice.dto.BlogDTO;
import com.example.webservice.model.Blog;

import java.util.List;

public interface IBlogService {
    List<BlogDTO> findTittle(String tittle);
    BlogDTO findById(int id);
}

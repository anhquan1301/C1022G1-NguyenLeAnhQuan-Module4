package com.example.webservice.service;

import com.example.webservice.dto.BlogDTO;
import com.example.webservice.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<BlogDTO> findTittle(String tittle, Pageable pageable);
    BlogDTO findById(int id);
}

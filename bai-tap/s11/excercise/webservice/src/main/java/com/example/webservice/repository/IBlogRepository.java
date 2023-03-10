package com.example.webservice.repository;

import com.example.webservice.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    List<Blog> findByTittleContaining(String tittle);
}

package com.example.excercise.repository;

import com.example.excercise.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IBlogRepository extends JpaRepository<Blog,Integer>{
Page<Blog> findByTittleContaining(String tittle, Pageable pageable);

Blog findById(int id);
}

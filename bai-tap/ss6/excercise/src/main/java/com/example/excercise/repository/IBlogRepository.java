package com.example.excercise.repository;

import com.example.excercise.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer>{
List<Blog>findByTittleContaining(String tittle);

Blog findById(int id);

}

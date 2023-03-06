package com.example.excercise.service.impl;

import com.example.excercise.model.Blog;
import com.example.excercise.model.BlogType;
import com.example.excercise.repository.IBlogRepository;
import com.example.excercise.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public Page<Blog> findAll(String tittle,Pageable pageable) {
        if(tittle==null){
            tittle="";
        }
        return iBlogRepository.findByTittleContaining(tittle,pageable);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public void edit(Blog blog) {
        iBlogRepository.save(blog);
    }
    @Override
    public void delete(int id) {
        iBlogRepository.delete(findById(id));
    }
}

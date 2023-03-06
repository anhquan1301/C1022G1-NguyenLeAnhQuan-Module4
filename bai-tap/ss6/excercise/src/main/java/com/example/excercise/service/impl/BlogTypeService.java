package com.example.excercise.service.impl;

import com.example.excercise.model.BlogType;
import com.example.excercise.repository.IBlogRepository;
import com.example.excercise.repository.IBlogTypeRepository;
import com.example.excercise.service.IBlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTypeService implements IBlogTypeService {
    @Autowired
    IBlogTypeRepository iBlogTypeRepository;

    @Override
    public List<BlogType> findByName(String name) {
        if(name==null){
            name="";
        }
        return iBlogTypeRepository.findByNameBlogTypeContaining(name);
    }

    @Override
    public void save(BlogType blogType) {
        iBlogTypeRepository.save(blogType);
    }
}

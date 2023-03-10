package com.example.webservice.service.impl;

import com.example.webservice.dto.BlogDTO;
import com.example.webservice.dto.CategoryDTO;
import com.example.webservice.model.Blog;
import com.example.webservice.repository.IBlogRepository;
import com.example.webservice.service.IBlogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public List<BlogDTO> findTittle(String tittle) {
        BlogDTO blogDTO;
        List<BlogDTO> blogDTOList = new ArrayList<>();
        List<Blog> blogList = iBlogRepository.findByTittleContaining(tittle);
        for(Blog b : blogList){
            blogDTO = new BlogDTO();
            BeanUtils.copyProperties(b,blogDTO);
            blogDTOList.add(blogDTO);
        }
        return blogDTOList;
    }

    @Override
    public BlogDTO findById(int id) {
        BlogDTO blogDTO = new BlogDTO();
        Blog blog = iBlogRepository.findById(id).get();
        blogDTO.setCategoryDTO(new CategoryDTO());
        BeanUtils.copyProperties(blog.getCategory(), blogDTO.getCategoryDTO());
        BeanUtils.copyProperties(blog, blogDTO);
        return blogDTO;
    }
}

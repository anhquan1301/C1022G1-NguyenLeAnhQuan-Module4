package com.example.webservice.service.impl;

import com.example.webservice.dto.BlogDTO;
import com.example.webservice.dto.CategoryDTO;
import com.example.webservice.model.Blog;
import com.example.webservice.repository.IBlogRepository;
import com.example.webservice.service.IBlogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;

    @Override
    public Page<BlogDTO> findTittle(String tittle, Pageable pageable) {
        BlogDTO blogDTO;
        List<BlogDTO> blogDTOList = new ArrayList<>();
        Page<Blog> blogList = iBlogRepository.findByTittleContaining(tittle,pageable);
        for(Blog b : blogList){
            blogDTO = new BlogDTO();
            blogDTO.setCategoryDTO(new CategoryDTO());
            BeanUtils.copyProperties(b.getCategory(),blogDTO.getCategoryDTO());
            BeanUtils.copyProperties(b,blogDTO);
            blogDTOList.add(blogDTO);
        }
        return new PageImpl<>(blogDTOList,pageable, blogList.getTotalElements());
    }

    @Override
    public BlogDTO findById(int id) {
        BlogDTO blogDTO = new BlogDTO();
        Blog blog = iBlogRepository.findById(id);
        blogDTO.setCategoryDTO(new CategoryDTO());
        BeanUtils.copyProperties(blog.getCategory(), blogDTO.getCategoryDTO());
        BeanUtils.copyProperties(blog, blogDTO);
        return blogDTO;
    }
}

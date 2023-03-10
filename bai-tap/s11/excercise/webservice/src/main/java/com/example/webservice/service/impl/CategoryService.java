package com.example.webservice.service.impl;

import com.example.webservice.dto.BlogDTO;
import com.example.webservice.dto.CategoryDTO;
import com.example.webservice.model.Blog;
import com.example.webservice.model.Category;
import com.example.webservice.repository.ICategoryRepository;
import com.example.webservice.service.ICategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public Page<CategoryDTO> findAll(Pageable pageable) {
        Page<Category> categoryList = iCategoryRepository.findAll(pageable);
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        CategoryDTO categoryDTO;
        for (Category category : categoryList) {
            categoryDTO = new CategoryDTO();
            Set<Blog> blogSet = category.getBlogSet();
            Set<BlogDTO> blogDTOS = new HashSet<>();
            BlogDTO blogDTO;
            for (Blog blog : blogSet) {
                blogDTO = new BlogDTO();
                BeanUtils.copyProperties(blog, blogDTO);
                blogDTOS.add(blogDTO);
            }
            BeanUtils.copyProperties(category, categoryDTO);
            categoryDTO.setBlogSet(blogDTOS);
            BeanUtils.copyProperties(category, categoryDTO);
            categoryDTOList.add(categoryDTO);
        }
        return new PageImpl<>(categoryDTOList);
    }

    @Override
    public CategoryDTO findById(int id) {
        CategoryDTO categoryDTO = new CategoryDTO();
        Category category = iCategoryRepository.findById(id);
        Set<Blog> blogSet = category.getBlogSet();
        Set<BlogDTO> blogDTOS = new HashSet<>();
        BlogDTO blogDTO;
        for (Blog blog : blogSet) {
            blogDTO = new BlogDTO();
            BeanUtils.copyProperties(blog, blogDTO);
            blogDTOS.add(blogDTO);
        }
        BeanUtils.copyProperties(category, categoryDTO);
        categoryDTO.setBlogSet(blogDTOS);
        return categoryDTO;
    }

}

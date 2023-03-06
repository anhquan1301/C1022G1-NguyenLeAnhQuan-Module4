package com.example.excercise.controller;

import com.example.excercise.model.Blog;
import com.example.excercise.model.BlogType;
import com.example.excercise.service.IBlogService;
import com.example.excercise.service.IBlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogTypeService iBlogTypeService;
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("")
    public String showList(Model model, @RequestParam(required = false) String tittle,
                           @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 5) Pageable pageable) {
        model.addAttribute("tittle", tittle);
        model.addAttribute("blogList", iBlogService.findAll(tittle, pageable));
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < iBlogService.findAll(tittle, pageable).getTotalPages(); i++) {
            integerList.add(i);
        }
        model.addAttribute("countPages", integerList);
        return "/list";
    }

    @GetMapping("/create-form")
    public String createBlog(Model model) {
        model.addAttribute("blogTypeList", iBlogTypeService.findByName(null));
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("msg", "successful new creation");
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/edit-form")
    public String editForm(Model model, @RequestParam(required = false) Integer id, RedirectAttributes redirectAttributes) {
        if (iBlogService.findById(id) != null) {
            model.addAttribute("blogTypeList", iBlogTypeService.findByName(null));
            model.addAttribute("blog", iBlogService.findById(id));
        } else {
            redirectAttributes.addFlashAttribute("msg", "ID does not exist");
            return "redirect:/blog";
        }
        return "/edit";
    }

    @PostMapping("edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("msg", "Successful upgrade");
        iBlogService.edit(blog);
        return "redirect:/blog";
    }

    @GetMapping("delete")
    public String delete(@RequestParam(required = false) Integer id, RedirectAttributes redirectAttributes) {
        if (iBlogService.findById(id) != null) {
            redirectAttributes.addFlashAttribute("msg", "Successful delete");
            iBlogService.delete(id);
        } else {
            redirectAttributes.addFlashAttribute("msg", "ID does not exist");
        }
        return "redirect:/blog";
    }
    @GetMapping("/category")
    public String category(@RequestParam(required = false) String name, Model model, BlogType blogType){
        model.addAttribute("name",name);
        model.addAttribute("category",iBlogTypeService.findByName(name));
        return "/category";
    }
    @GetMapping("/create-category-form")
    public String createCategoryForm(Model model){
        model.addAttribute("category", new BlogType());
        return "create-category";
    }
    @PostMapping("/create-category")
    public String createCategory(@ModelAttribute BlogType blogType){
        iBlogTypeService.save(blogType);
        return "redirect:/blog/category";
    }
}

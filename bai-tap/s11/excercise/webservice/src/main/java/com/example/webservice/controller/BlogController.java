package com.example.webservice.controller;

import com.example.webservice.dto.BlogDTO;
import com.example.webservice.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService iBlogService;
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<BlogDTO> blogDTOS(@RequestParam(name = "tittle",required = false,defaultValue = "") String tittle){
        return iBlogService.findTittle(tittle);
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/detail")
    public BlogDTO detail(@RequestParam(required = false) Integer id) {
        return iBlogService.findById(id);
    }
}

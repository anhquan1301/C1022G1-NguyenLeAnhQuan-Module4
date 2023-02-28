package com.example.exercise1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("/sandwich-condiment")
public class SandwichController {
    @GetMapping("")
    public String save(@RequestParam(required = false) String[] condiment, Model model){
        model.addAttribute("condiment",Arrays.toString(condiment));
        return "/list";
    }
}

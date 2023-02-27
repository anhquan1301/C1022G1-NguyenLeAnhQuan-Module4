package com.example.exercise1.controller;

import com.example.exercise1.service.ISandwichService;
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

    @Autowired
    ISandwichService iSandwichService;
    @GetMapping("")
    public String save(@RequestParam(value = "condiment", required = false, defaultValue = "") String[] condiment, Model model){
        model.addAttribute("condiment",Arrays.toString(condiment));
        return "/list";
    }
}

package com.example.excercise.controller;

import com.example.excercise.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/setting")
public class SettingController {
    @Autowired
    ISettingService iSettingService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("settingList",iSettingService.findAll());
        return "/list";
    }
}

package com.example.excercise.controller;

import com.example.excercise.model.Setting;
import com.example.excercise.service.ISettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;

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
    @GetMapping("/edit-form")
   public String editForm(Model model, @RequestParam Integer id){
        Setting setting = iSettingService.findById(id);
        if(setting!=null) {
            model.addAttribute("setting", setting);
            model.addAttribute("listLanguages", Arrays.asList("Vietnamese", "English", "Japanese", "Chinese"));
            model.addAttribute("listPageSize", Arrays.asList("5", "10", "15", "25", "50", "100"));
        }
        return "/edit";
    }
    @PostMapping("/update")
    public String edit(@ModelAttribute Setting setting, RedirectAttributes redirectAttributes){
        iSettingService.edit(setting);
        redirectAttributes.addFlashAttribute("msg","Successful upgrade");
        return "redirect:/setting";
    }
    @GetMapping("/create-form")
    public String createForm(Model model){
        model.addAttribute("setting",new Setting());
        model.addAttribute("listLanguages", Arrays.asList("Vietnamese", "English", "Japanese", "Chinese"));
        model.addAttribute("listPageSize", Arrays.asList("5", "10", "15", "25", "50", "100"));
        return "/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Setting setting, RedirectAttributes redirectAttributes){
        iSettingService.save(setting);
        redirectAttributes.addFlashAttribute("msg","Successful new creation");
        return "redirect:/setting";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(required = false) Integer id){
        iSettingService.delete(id);
        return "redirect:/setting";
    }
}

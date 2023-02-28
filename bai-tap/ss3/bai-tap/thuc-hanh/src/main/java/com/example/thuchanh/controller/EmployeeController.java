package com.example.thuchanh.controller;

import com.example.thuchanh.model.Employee;
import com.example.thuchanh.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @GetMapping("")
    public String showList(Model model, @RequestParam(required = false) String name){
        model.addAttribute("employeeList",iEmployeeService.showList(name));
        return "/list";
    }
    @GetMapping("/creation-form")
    public String creationForm(Model model){
            model.addAttribute("employee",new Employee());
            return "/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Employee employee, RedirectAttributes redirectAttributes){
        iEmployeeService.save(employee);
        redirectAttributes.addFlashAttribute("msg","Tạo mới thành công");
        return "redirect:/employee";
    }

}

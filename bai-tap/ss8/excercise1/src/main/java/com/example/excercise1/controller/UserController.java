package com.example.excercise1.controller;

import com.example.excercise1.model.User;
import com.example.excercise1.model.dto.UserDTO;
import com.example.excercise1.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    IUserService iUserService;
    @GetMapping("")
    public String findAll(Model model){
        model.addAttribute("userList",iUserService.findAll());
        return "/list";
    }
    @GetMapping("create-form")
    public String createForm(Model model){
        model.addAttribute("userDto",new UserDTO());
        return "/create";
    }
    @PostMapping("create")
    public String create(@Validated @ModelAttribute("userDto") UserDTO userDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "/create";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        iUserService.save(user);
        return "redirect:/user";
    }
}

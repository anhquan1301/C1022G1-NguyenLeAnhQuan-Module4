package com.example.excercise2.controller;

import com.example.excercise2.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/calculator")
@Controller
public class CalculatorController {
    @Autowired
    ICalculatorService iCalculatorService;
    @GetMapping("")
    public String calculator(@RequestParam(required = false, defaultValue = "") Double firstOperand , Double secondOperand, String operand, Model model){
        if(firstOperand==null&&secondOperand==null){
            return "/result";
        }
        double result = iCalculatorService.calculator(firstOperand,secondOperand,operand);
        model.addAttribute("firstOperand",firstOperand);
        model.addAttribute("secondOperand",secondOperand);
        model.addAttribute("result",result);
        return "/result";
    }
}

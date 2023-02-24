package com.example.bai1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/currency-conversion")
public class CurrencyConversion {
    @GetMapping("")
 public String changeMoney(@RequestParam(required = false) Double usd, Model model){
        if(usd==null){
            return "result";
        }
        double result = 23.792 * usd;
        model.addAttribute("usd",usd);
        model.addAttribute("result",result);
        return "result";
 }
}

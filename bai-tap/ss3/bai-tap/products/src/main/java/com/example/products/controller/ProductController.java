package com.example.products.controller;

import com.example.products.model.Product;
import com.example.products.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
   private IProductService iProductService;
    @GetMapping("")
    public String searchList(@RequestParam(required = false) String name, Model model){
        model.addAttribute("name",name);
        model.addAttribute("listProduct",iProductService.findALl(name));
        return "/list";
    }

    @GetMapping("create-form")
    public String createForm(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }
    @PostMapping("create")
    public String create(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg","Tạo mới thành công");
        iProductService.save(product);
        return "redirect:/product";
    }
    @GetMapping("edit-form")
    public String editForm(Model model, @RequestParam(required = false) Integer id,RedirectAttributes redirectAttributes){
        Product product =  iProductService.findById(id);
        if(product!=null) {
            model.addAttribute("product", product);
        }else {
            redirectAttributes.addFlashAttribute("msg","Id không tồn tại");
        }
        return "/edit";
    }
    @PostMapping("edit")
    public String edit(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("msg","Chỉnh sửa thành công");
        iProductService.edit(product);
        return "redirect:/product";
    }
    @GetMapping("delete")
    public String delete(@RequestParam(required = false) Integer id,RedirectAttributes redirectAttributes){
        if(iProductService.findById(id)!=null){
            redirectAttributes.addFlashAttribute("msg","Xóa thành công");
            iProductService.delete(id);
        }else {
            redirectAttributes.addFlashAttribute("msg","Id không tồn tại");
        }
        return "redirect:/product";
    }
    @GetMapping("detail-form")
    public String detail(@RequestParam(required = false) Integer id, Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "/detail";
    }
}

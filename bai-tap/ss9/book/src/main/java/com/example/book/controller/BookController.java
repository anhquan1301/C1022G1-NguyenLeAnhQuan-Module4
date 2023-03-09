package com.example.book.controller;

import com.example.book.model.Book;
import com.example.book.repository.IBookRepository;
import com.example.book.service.IBookService;
import com.example.book.service.ICodeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/book")
@Controller
public class BookController {
    @Autowired
   private IBookService iBookService;
    private ICodeBookService iCodeBookService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("bookList",iBookService.findAll());
        return "/list";
    }
    @GetMapping ("/borrow")
    public String borrow(@RequestParam(required = false) Integer id) {
        iBookService.borrow(id);
        return "redirect:/book";
    }
    @GetMapping("/return")
    public String returnBook(@RequestParam(required = false)Integer code){
            iBookService.returnBook(code);
            iCodeBookService.remove(code);
        return "redirect:/book";
    }
}

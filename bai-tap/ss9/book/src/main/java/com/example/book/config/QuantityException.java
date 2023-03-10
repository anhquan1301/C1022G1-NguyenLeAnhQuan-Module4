package com.example.book.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class QuantityException {
@ExceptionHandler(com.example.book.exception.QuantityException.class)
    public String handleQuantityException(){
    return "error";
}
}

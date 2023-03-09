package com.example.book.service;

import com.example.book.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    int borrow(int id);
    Book findById(int id);
    void returnBook(int code);
}

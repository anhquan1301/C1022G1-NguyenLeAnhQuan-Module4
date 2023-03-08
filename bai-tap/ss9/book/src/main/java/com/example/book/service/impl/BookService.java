package com.example.book.service.impl;

import com.example.book.repository.IBookRepository;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository iBookRepository;

}

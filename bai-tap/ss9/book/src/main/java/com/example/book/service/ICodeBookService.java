package com.example.book.service;

import com.example.book.model.CodeBook;

public interface ICodeBookService {
    CodeBook findByCodeBook(int codeBook);
    void remove(int code);
}

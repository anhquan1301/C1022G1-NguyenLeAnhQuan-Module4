package com.example.book.service.impl;

import com.example.book.model.Book;
import com.example.book.model.CodeBook;
import com.example.book.repository.IBookRepository;
import com.example.book.repository.ICodeBookRepository;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    IBookRepository iBookRepository;
    @Autowired
    ICodeBookRepository iCodeBookRepository;

    @Override
    public List<Book> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public int borrow(int id) {
        Book book = iBookRepository.findById(id);
        book.setQuantity(book.getQuantity()-1);
        int code = (int) Math.floor((Math.random()*89999)+10000);
        CodeBook codeBook = new CodeBook();
        codeBook.setCodeBook(code);
        codeBook.setBook(book);
        iCodeBookRepository.save(codeBook);
        iBookRepository.save(book);
        return code;
    }
    @Override
    public Book findById(int id) {
        return iBookRepository.findById(id);
    }

    @Override
    public void returnBook(int code) {
        Book book = iCodeBookRepository.findByCodeBook(code).getBook();
        book.setQuantity(book.getQuantity()+1);
        iBookRepository.save(book);
    }
}

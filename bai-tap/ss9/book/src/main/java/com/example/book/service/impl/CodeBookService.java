package com.example.book.service.impl;

import com.example.book.model.CodeBook;
import com.example.book.repository.IBookRepository;
import com.example.book.repository.ICodeBookRepository;
import com.example.book.service.ICodeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CodeBookService implements ICodeBookService {
@Autowired
    ICodeBookRepository iCodeBookRepository;
    @Override
    public CodeBook findByCodeBook(int codeBook) {
        return iCodeBookRepository.findByCodeBook(codeBook);
    }
    @Transactional
    @Override
    public void remove(int code) {
        iCodeBookRepository.deleteByCodeBook(code);
    }


}

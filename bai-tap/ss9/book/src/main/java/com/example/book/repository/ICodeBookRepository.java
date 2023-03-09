package com.example.book.repository;

import com.example.book.model.CodeBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICodeBookRepository extends JpaRepository<CodeBook,Integer> {
    CodeBook findByCodeBook(int codeBook);
    void deleteByCodeBook(Integer codeBook);
}

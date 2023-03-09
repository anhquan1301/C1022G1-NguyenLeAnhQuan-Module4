package com.example.book.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String content;
    private Integer quantity;
    @OneToMany(mappedBy = "book")
    private List<CodeBook> codeBookList;

    public List<CodeBook> getCodeBookList() {
        return codeBookList;
    }

    public void setCodeBookList(List<CodeBook> codeBookList) {
        this.codeBookList = codeBookList;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}

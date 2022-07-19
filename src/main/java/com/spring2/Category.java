package com.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Category {
    private String categoryname;

    private Book java;
    public Category(String categoryname) {
        this.categoryname = categoryname;
    }
    public Category(Book java) {
        this.java = java;
    }

    public Category(String categoryname, Book java) {
        this.categoryname = categoryname;
        this.java = java;
    }

    public Category() {
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Book getJava() {
        return java;
    }
@Autowired
    public void setJava(Book java) {
        this.java = java;
    }
}

package com.spring11;

public class Book {
    private  int id;
    private String author;

    public Book(int id, String author) {
        this.id = id;
        this.author = author;
    }

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

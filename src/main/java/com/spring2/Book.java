package com.spring2;

import org.springframework.stereotype.Component;

public class Book {
    private int book_id;
    private String bookname;

    public Book(int book_id, String bookname, int price) {
        this.book_id = book_id;
        this.bookname = bookname;
        this.price = price;
    }

    private int price;

    public Book() {
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

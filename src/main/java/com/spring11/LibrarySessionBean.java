package com.spring11;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
@Local(LibrarySessionBeanRemote.class)

public class LibrarySessionBean implements LibrarySessionBeanRemote{
    List<String> bookShelf;

    public LibrarySessionBean() {
        bookShelf = new ArrayList<String>();
    }

    public void addBook(String bookName) {
        bookShelf.add(bookName);
    }

    public List<String> getBooks() {
        return bookShelf;
    }
}

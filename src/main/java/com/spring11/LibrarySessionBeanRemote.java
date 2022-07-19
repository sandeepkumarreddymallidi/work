package com.spring11;
import javax.ejb.Remote;
import java.util.List;

@Remote
public interface LibrarySessionBeanRemote {
    void addBook(String bookName);
    List getBooks();
}
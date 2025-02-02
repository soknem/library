package org.example.service;

import org.example.model.Book;

public interface BookService {

    void addBook(Long id, String title,String author,String authorActiveYear,Integer publishedYear);

    Book findBookById(Long id);

    Book[] findAllBooks();


}

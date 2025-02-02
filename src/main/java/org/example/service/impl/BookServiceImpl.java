package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.service.BookService;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private  final BookRepository bookRepository;
    @Override
    public void addBook(Long id, String title,String author,String authorActiveYear,Integer publishedYear) {

        Book book = new Book();
        book.setAuthor(author);
        //.........
        //other logic, like validation, checking or other
        bookRepository.save(book);

    }

    @Override
    public Book findBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book[] findAllBooks() {
        return bookRepository.findAll();
    }
}

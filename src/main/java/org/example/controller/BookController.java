package org.example.controller;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.model.Book;
import org.example.service.BookService;

@NoArgsConstructor
public class BookController {

    private  BookService bookService = new BookService() {
        @Override
        public void addBook(Long id, String title, String author, String authorActiveYear, Integer publishedYear) {

        }

        @Override
        public Book findBookById(Long id) {
            return null;
        }

        @Override
        public Book[] findAllBooks() {
            return new Book[0];
        }
    };

    public void addBook(Long id, String title,String author,String authorActiveYear,Integer publishedYear){

        bookService.addBook(id,title,author,authorActiveYear,publishedYear);
    }
}

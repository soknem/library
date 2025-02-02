package org.example.repository;


import org.example.model.Book;

import java.lang.reflect.Array;


public class BookRepository {
    private int index=0;
    private final Book[] books = new Book[200];

    public void save(Book book){
        books[index++]=book;
    }

    public Book[] findAll(){
        return new Book[index+1];
    }

    public Book findById(Long id){
        for (Book book:books){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }

    public void otherAction(){
        //add your action, like borrow, return and other
    }

}

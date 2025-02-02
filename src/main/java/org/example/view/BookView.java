package org.example.view;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.controller.BookController;

import java.util.Scanner;

@NoArgsConstructor
public class BookView {

    Scanner scanner = new Scanner(System.in);
    private  BookController bookController = new BookController();
    public void displayMenu(){

    }

    public void DisplayBook(){

    }

    public void addBook(){
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        //......
        bookController.addBook(1l,title,author,"",1);

    }
}

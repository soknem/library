package org.example;

import lombok.RequiredArgsConstructor;
import org.example.view.BookView;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

@RequiredArgsConstructor
public class Main {


    static  BookView bookView =new BookView();

   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter option: ");
        int op = scanner.nextInt();
        switch (op){
            case 1->{
                bookView.addBook();
            }
        }
    }
}
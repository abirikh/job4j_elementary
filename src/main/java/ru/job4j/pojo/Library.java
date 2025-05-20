package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("The Lord of the Ring", 2765);
        Book book2 = new Book("Clean code", 366);
        Book book3 = new Book("Beginner", 50);
        Book book4 = new Book("I'm dumb", 666);
        Book[] bookshelf = new Book[4];
        bookshelf[0] = book1;
        bookshelf[1] = book2;
        bookshelf[2] = book3;
        bookshelf[3] = book4;

        System.out.println("Книги на полке:");
        for (int i = 0; i < bookshelf.length; i++) {
            Book book = bookshelf[i];
            System.out.println("Название: " + book.getName() + ", " + book.getPages() + " страниц.");
        }
        System.out.println();

        Book replacement = bookshelf[0];
        bookshelf[0] = bookshelf[3];
        bookshelf[3] = replacement;
        System.out.println("Книги на полке после замены:");
        for (int i = 0; i < bookshelf.length; i++) {
            Book book = bookshelf[i];
            System.out.println("Название: " + book.getName() + ", " + book.getPages() + " страниц.");
        }

        System.out.println();

        System.out.println("Книга найдена:");
        for (int i = 0; i < bookshelf.length; i++) {
            Book book = bookshelf[i];
            if (Objects.equals(book.getName(), "Clean code")) {
                System.out.println("Название: " + book.getName() + ", " + book.getPages() + " страниц.");
            }
        }
    }
}
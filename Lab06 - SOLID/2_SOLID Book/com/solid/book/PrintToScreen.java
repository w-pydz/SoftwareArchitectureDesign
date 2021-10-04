package com.solid.book;

public class PrintToScreen {
    static void printToScreen(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}

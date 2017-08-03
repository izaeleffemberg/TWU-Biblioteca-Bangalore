package com.twu.biblioteca;

import com.twu.biblioteca.View.DocumentView;
import com.twu.biblioteca.View.PrintMessages;

public class BibliotecaApp {
    public static void main(String[] args) {
        // Show Welcome Message
        PrintMessages printMessages = new PrintMessages();
        printMessages.showWelcomeMessage();

        //Show list of books
        DocumentView documentView = new DocumentView();
        documentView.showListOfBooksOfLibrary();
    }
}

package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller.DocumentsController;
import com.twu.biblioteca.Model.Document;

import java.util.List;

public class DocumentView {

    private DocumentsController documentsController;

    public DocumentView() {
        this.documentsController = new DocumentsController();
    }

    public void showListOfBooksOfLibrary(){

        System.out.println("- - List of Books - -");
        if (documentsController.getListOfBooksInLibrary() != null && documentsController.getListOfBooksInLibrary().size() != 0) {
            for (Document doc : documentsController.getListOfBooksInLibrary()) {
                System.out.println(
                        documentsController.getListOfBooksInLibrary().indexOf(doc) + " - " +
                                "Name: " + doc.getName() +
                                " - Author: " + doc.getAuthor() +
                                "- Year of published: " + doc.getYearPublished());
            }
        } else {
            System.out.println("list of book is empty!");
        }
    }

    public void showEmptyListOfBooks(){
        System.out.println("- - List of Books - -");
        if (documentsController.getEmptyListOfBooksInLibraryMock() != null && documentsController.getEmptyListOfBooksInLibraryMock().size() != 0) {
        } else {
            System.out.println("list of book is empty!");
        }
    }
}

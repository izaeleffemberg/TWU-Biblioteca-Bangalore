package com.twu.biblioteca.Exception;

public class ListOfDocumentsNotHaveOnlyBooksException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ListOfDocumentsNotHaveOnlyBooksException(){
        System.out.println("The list not have only books!");
    }

}

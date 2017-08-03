package com.twu.biblioteca.Exception;

public class EmptyDocumentListException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public EmptyDocumentListException (){
        System.out.println("Empty Document List!");
    }

}

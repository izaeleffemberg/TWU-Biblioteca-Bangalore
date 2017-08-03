package com.twu.biblioteca.Exception;

public class OptionChosenByTheUserInvalidException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public OptionChosenByTheUserInvalidException(){
        System.out.println("Option Chosen Invalid!");
    }


}


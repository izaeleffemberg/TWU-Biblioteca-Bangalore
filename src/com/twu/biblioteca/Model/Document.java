package com.twu.biblioteca.Model;

public class Document {

    private String name;
    private EnumTypeOfDocument type;
    private int yearPublished;
    private String author;

    public Document(String name, EnumTypeOfDocument type, String author, int yearPublished){
        this.name = name;
        this.type = type;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public EnumTypeOfDocument getType() {
        return type;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getAuthor() {
        return author;
    }
}


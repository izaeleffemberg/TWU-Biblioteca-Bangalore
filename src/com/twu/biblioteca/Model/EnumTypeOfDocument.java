package com.twu.biblioteca.Model;

  public enum EnumTypeOfDocument {

      BOOK("Book"),
      ARTICLE("Article"),
      VIDEO("Video");

      public String description;

      EnumTypeOfDocument(String description){
          this.description = description;
      }
}

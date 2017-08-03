package com.twu.biblioteca.Repository;

import com.twu.biblioteca.Model.Document;
import com.twu.biblioteca.Model.EnumTypeOfDocument;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepository {

    private List<Document> documents;

    public DocumentRepository(){
        documents = new ArrayList<Document>();
    }

    public boolean addDocument(Document document){
        if (this.documents.add(document)){
            return true;
        }
        return false;
    }

    public boolean removeDocument(Document document){
        if (this.documents.remove(document)){
            return true;
        }
        return false;
    }

    public List<Document> listOfDocumentsThatContainsOnyBooksMock(){
        ArrayList<Document> mockList = new ArrayList<Document>();
        Document book1 = new Document("Book Test 1", EnumTypeOfDocument.BOOK,"Izael", 2017);
        mockList.add(book1);
        Document book2 = new Document("Book Test 2", EnumTypeOfDocument.BOOK,"Izael", 2016);
        mockList.add(book2);
        Document book3 = new Document("Book Test 3", EnumTypeOfDocument.BOOK,"Izael", 2015);
        mockList.add(book3);
        return mockList;
    }

    public List<Document> listOfDocumentsThatNotHaveOnyBooksMock(){
        ArrayList<Document> mockList = new ArrayList<Document>();
        Document book1 = new Document("Book Test 1", EnumTypeOfDocument.BOOK,"Izael", 2017);
        mockList.add(book1);
        Document book2 = new Document("Book Test 2", EnumTypeOfDocument.ARTICLE,"Izael", 2016);
        mockList.add(book2);
        Document book3 = new Document("Book Test 3", EnumTypeOfDocument.BOOK,"Izael", 2015);
        mockList.add(book3);
        return mockList;
    }

    public List<Document> getEmptyListMock(){
        return new ArrayList<Document>();
    }

    public List<Document> getDocuments() {
        return documents;
    }
}


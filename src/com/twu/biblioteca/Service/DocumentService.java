package com.twu.biblioteca.Service;

import com.twu.biblioteca.Exception.EmptyDocumentListException;
import com.twu.biblioteca.Exception.ListOfDocumentsNotHaveOnlyBooksException;
import com.twu.biblioteca.Model.Document;
import com.twu.biblioteca.Model.EnumTypeOfDocument;
import com.twu.biblioteca.Repository.DocumentRepository;

import java.util.ArrayList;
import java.util.List;

public class DocumentService {

    private DocumentRepository documentRepository;

    public DocumentService(){
        documentRepository = new DocumentRepository();
    }

    public boolean verifyIfListContainsOnlyBooks(List<Document> documents){ // books
        if (documents != null && documents.size() != 0){
            for (Document doc: documents) {
                if (doc.getType() != EnumTypeOfDocument.BOOK) {
                    return false;
                } else {
                    throw new ListOfDocumentsNotHaveOnlyBooksException();
                }
            }
        } else {
            throw new EmptyDocumentListException();
        }
        return true;
    }

    public List<Document> getOnlyBooksOfLibrary(List<Document> documents) {
        ArrayList<Document> books = new ArrayList<Document>();
        try {
            if (documentRepository.getDocuments() != null && documentRepository.getDocuments().size() == 0) {
                for (Document document : documents) {
                    if (document.getType() == EnumTypeOfDocument.BOOK) {
                        books.add(document);
                    }
                }
            } else {
                throw new EmptyDocumentListException();
            }
        } catch (EmptyDocumentListException e) {
            e.getMessage();
        }
        return books;
    }

    public DocumentRepository getDocumentRepository() {
        return documentRepository;
    }
}


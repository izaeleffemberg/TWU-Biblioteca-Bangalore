package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Model.Document;
import com.twu.biblioteca.Service.DocumentService;

import java.util.List;

public class DocumentsController {

   private DocumentService documentService;

    public DocumentsController() {
        this.documentService = new DocumentService();
    }

    public List<Document> getListOfBooksInLibrary(){
        return documentService.getOnlyBooksOfLibrary(documentService.getDocumentRepository().getDocuments());

    }

    public List<Document> getEmptyListOfBooksInLibraryMock(){
        return documentService.getOnlyBooksOfLibrary(documentService.getDocumentRepository().getEmptyListMock());

    }
}


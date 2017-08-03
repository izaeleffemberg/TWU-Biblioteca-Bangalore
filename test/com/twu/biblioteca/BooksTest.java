package com.twu.biblioteca;

import com.twu.biblioteca.Exception.EmptyDocumentListException;
import com.twu.biblioteca.Exception.ListOfDocumentsNotHaveOnlyBooksException;
import com.twu.biblioteca.Repository.DocumentRepository;
import com.twu.biblioteca.Service.DocumentService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BooksTest {

    private DocumentService documentService;
    private DocumentRepository documentRepository;

    @Test
    public void GivenAListOfDocuments_WhenIAskTheDocumentService_ThenItWillBeCheckedIfThisListContainsOnlyBooks() {
        documentService = new DocumentService();
        documentRepository = new DocumentRepository();
        boolean flagOfVerification = documentService.verifyListOfBooks(documentRepository.listOfDocumentsThatContainsOnyBooksMock());
        assertEquals(true, flagOfVerification);
    }

    @Test(expected = ListOfDocumentsNotHaveOnlyBooksException.class)
    public void GivenAListOfDocuments_WhenIAskTheDocumentService_ThenItWillBeCheckedIfThisListNotHaveOnlyBooks(){
        documentService = new DocumentService();
        documentRepository = new DocumentRepository();
        documentService.verifyListOfBooks(documentRepository.listOfDocumentsThatNotHaveOnyBooksMock());
    }


}

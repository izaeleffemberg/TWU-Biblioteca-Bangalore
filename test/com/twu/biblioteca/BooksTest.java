package com.twu.biblioteca;

import com.twu.biblioteca.Exception.EmptyDocumentListException;
import com.twu.biblioteca.Exception.ListOfDocumentsNotHaveOnlyBooksException;
import com.twu.biblioteca.Repository.DocumentRepository;
import com.twu.biblioteca.Service.DocumentService;
import com.twu.biblioteca.View.DocumentView;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class BooksTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private DocumentService documentService;
    private DocumentRepository documentRepository;

    @Before
    public void initializeVariable(){
        documentRepository = new DocumentRepository();
        documentService = new DocumentService();
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test(expected = ListOfDocumentsNotHaveOnlyBooksException.class)
    public void GivenAListOfDocuments_WhenIAskTheDocumentService_ThenItWillBeCheckedIfThisListNotHaveOnlyBooks(){
        documentService = new DocumentService();
        documentRepository = new DocumentRepository();
        documentService.verifyIfListContainsOnlyBooks(documentRepository.listOfDocumentsThatNotHaveOnyBooksMock());
    }

    @Test (expected = EmptyDocumentListException.class)
    public void GivenAListOfDocuments_WhenIAskTheDocumentService_ThenItWillBeCheckedIfThisListIsEmpty(){
        documentService = new DocumentService();
        documentRepository = new DocumentRepository();
        documentService.verifyIfListContainsOnlyBooks(documentRepository.getEmptyListMock());
    }

    @Test
    public void GivenAListOfDocuments_WhenIAskTheDocumentView_ThenItWillPrintAnEmptyListOfBooks(){
        DocumentView documentView = new DocumentView();
        documentView.showEmptyListOfBooks();
        assertEquals("- - List of Books - -\nlist of book is empty!\n", outContent.toString());
    }

}

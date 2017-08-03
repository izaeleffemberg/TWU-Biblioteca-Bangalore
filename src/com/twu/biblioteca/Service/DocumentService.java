package com.twu.biblioteca.Service;

import com.twu.biblioteca.Exception.EmptyDocumentListException;
import com.twu.biblioteca.Exception.ListOfDocumentsNotHaveOnlyBooksException;
import com.twu.biblioteca.Model.Document;
import com.twu.biblioteca.Model.EnumTypeOfDocument;
import com.twu.biblioteca.Repository.DocumentRepository;

import java.util.List;

public class DocumentService {

    private DocumentRepository documentRepository;

    public DocumentService(){
        documentRepository = new DocumentRepository();
    }

    /**
     * Method that verify if the list returned is an only list books - verificar se a lista contem apenas livros
     * **/
    public boolean verifyListOfBooks(List<Document> books){ // books
        if (books != null || books.size() != 0){
            for (Document doc: books) {
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
}

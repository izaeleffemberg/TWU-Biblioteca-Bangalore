package com.twu.biblioteca.Service;

import com.twu.biblioteca.Exception.OptionChosenByTheUserInvalidException;
import com.twu.biblioteca.Model.Document;

import java.util.List;

public class MenuService {

    private DocumentService documentService;

    public MenuService() {
        documentService = new DocumentService();
    }

    public List<Document> returnListChosenByTheUser(int optionChosenByTheUser){

        List<Document> listChosenByTheUser;

        switch (optionChosenByTheUser){
            case 1:
                listChosenByTheUser = documentService.getOnlyBooksOfLibrary(documentService.getDocumentRepository().getDocuments());
            break;
            default:
                throw new OptionChosenByTheUserInvalidException();
        }
        return listChosenByTheUser;
    }

    public String returnMenuOptions(){
        String menuText = " -- Menu -- \n";
        menuText += "Choice the option for visualization \n";
        menuText += "1 - List of Books \n";
        menuText += "2 - List of Movies \n";
        menuText += "Enter the number of desired option: \n";
        return menuText;
    }

}


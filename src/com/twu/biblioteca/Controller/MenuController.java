package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Model.Document;
import com.twu.biblioteca.Service.DocumentService;
import com.twu.biblioteca.Service.MenuService;

import java.util.List;

public class MenuController {

    private int optionChosenByTheUser;
    private MenuService menuService;

    public MenuController() {
        menuService = new MenuService();
    }

    public void setOptionChosenByTheUser(int optionChosenByTheUser){
        this.optionChosenByTheUser = optionChosenByTheUser;
    }

    public List<Document> returnTheListChosenByTheUser(){
        return menuService.returnListChosenByTheUser(optionChosenByTheUser);
    }

}

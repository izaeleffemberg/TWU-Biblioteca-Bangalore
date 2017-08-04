package com.twu.biblioteca;

import com.sun.source.tree.AssertTree;
import com.twu.biblioteca.Controller.MenuController;
import com.twu.biblioteca.Exception.OptionChosenByTheUserInvalidException;
import com.twu.biblioteca.Service.MenuService;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class MenuTest {

    private MenuService menuService;

    @Before
    public void initializeVariable(){
        menuService = new MenuService();
    }


    @Test(expected = OptionChosenByTheUserInvalidException.class)
    public void GivenInvalidInputOfUser_WhenIAskMenuController_ThenWillThrowTheExceptionOfOptionInvalid(){
        MenuController menuController = new MenuController();
        int invalidOptionMock = 50;
        this.menuService.returnListChosenByTheUser(invalidOptionMock);
    }

    @Test // the name of method is an possible codesemlls
    public void GivenAListOfOptionsInMenu_WhenIAskMenuService_ThenTheMenuServiceWillVerifyIfTheOptionChosenByTheUserContainsInListOfOptionsOfMenu(){
        String menuOutput = this.menuService.returnMenuOptions();
        Integer optionChosenByTheUser = 1; // chosen list of books
        boolean verifyIfTheMenuContainsTheOption = menuOutput.contains(optionChosenByTheUser.toString());
        assertEquals(true, verifyIfTheMenuContainsTheOption);
    }

    @Test
    public void GivenAListOfOptinsInMenu_WhenIAskMenuService_ThenWillVerifyIfOptionsOfMenuContainsTheExitOption(){
        String menuOutput = this.menuService.returnMenuOptions();
        boolean verifyIfTheMenuContainsTheOption = menuOutput.contains("Exit");
        assertEquals(true, verifyIfTheMenuContainsTheOption);
    }


}

package com.twu.biblioteca;

import com.twu.biblioteca.Controller.MenuController;
import com.twu.biblioteca.Exception.OptionChosenByTheUserInvalidException;
import org.junit.Test;


public class MenuTest {

    @Test(expected = OptionChosenByTheUserInvalidException.class)
    public void GivenInvalidInputOfUser_WhenIAskMenuController_ThenWillThrowTheExceptionOfOptionInvalid(){
        MenuController menuController = new MenuController();
        int invalidOptionMock = 50;
        menuController.setOptionChosenByTheUser(invalidOptionMock);
        menuController.returnTheListChosenByTheUser();
    }


}

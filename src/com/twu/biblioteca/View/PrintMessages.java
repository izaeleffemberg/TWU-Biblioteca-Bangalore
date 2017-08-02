package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller.WelcomeController;

public class PrintMessages {

    public void welcomeMessage(){
        WelcomeController welcomeController = new WelcomeController();
        System.out.println(welcomeController.welcomeMessage());
    }

}

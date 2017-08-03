package com.twu.biblioteca.View;

import com.twu.biblioteca.Controller.MessageController;

public class PrintMessages {

    public void welcomeMessage(){
        MessageController messageController = new MessageController();
        System.out.println(messageController.showWelcomeMessage());
    }

}

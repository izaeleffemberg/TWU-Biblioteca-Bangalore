package com.twu.biblioteca;


import com.twu.biblioteca.Controller.MessageController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WelcomeTest {

    /**
     * Test of the first user story
     * **/
    @Test
    public void GivenTheMessageController_WhenIAskForWelcomeMessage_ThenWelcomeMessageIsPresented() {
        // given
        MessageController messageController = new MessageController();

        //when
        String mockOutput = messageController.showWelcomeMessage();

        //then
        assertEquals("Welcome to the bangalore biblioteca!", mockOutput);
    }

    @Test
    public void GivenTheMessageController_WhenIAskForInvalidMessage_ThenInvalidMessageExceptionIsThrown(){


    }

}

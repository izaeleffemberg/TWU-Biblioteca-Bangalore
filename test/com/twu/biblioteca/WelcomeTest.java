package com.twu.biblioteca;


import com.twu.biblioteca.Controller.WelcomeController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class WelcomeTest {

    /**
     * Test of the first user story
     * **/
    @Test
    public void showMessageTest() {
        WelcomeController welcomeController = new WelcomeController();
        String mockOutput = welcomeController.welcomeMessage();
        assertEquals("Welcome to the bangalore biblioteca!", mockOutput);
    }

}

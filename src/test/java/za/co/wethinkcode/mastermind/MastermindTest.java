package za.co.wethinkcode.mastermind;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MastermindTest {
    @Test
    public void testIsCorrect(){
        Mastermind mastermind = new Mastermind();
        assertTrue(mastermind.isCorrect("1234","1234"));
    }
    @Test
    void testPlayerExits(){
        InputStream inputStream = new ByteArrayInputStream("exit\n".getBytes());
        Player player = new Player(inputStream);

        String guess = player.getGuess();
        assertEquals(guess.toLowerCase(), "exit");
    }

    @Test
    void testPlayerQuits(){
        InputStream inputStream = new ByteArrayInputStream("quit\n".getBytes());
        Player player = new Player(inputStream);

        String guess = player.getGuess();
        assertEquals(guess.toLowerCase(), "quit");
    }
}
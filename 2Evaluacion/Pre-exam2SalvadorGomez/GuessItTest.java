/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.guessit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author salva
 */
public class GuessItTest {
    
    public GuessItTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of guessIt method, of class GuessIt.
     */
    @Test
    public void testGuessIt() {
        System.out.println("guessIt");
        int targetNumber = 12;
        int guess = 1;
        int maxAttempts = 5;
        boolean expResult = false;
        boolean result = GuessIt.guessIt(targetNumber, guess, maxAttempts);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of main method, of class GuessIt.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GuessIt.main(args);
        
    }
    
}

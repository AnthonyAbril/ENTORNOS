/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junit1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnot
 */
public class LampTest {
    
    static Lamp instance;
    public LampTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance = new Lamp();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown(){
        
    }    
            
    /**
     * Test of turnOn method, of class Lamp.
     */
    @Test
    public void testTurnOn() {
        System.out.println("test turnOn");
        Lamp instance = new Lamp();
        String expResult = "Light on? true";
        String result = instance.turnOn();
    }

    /**
     * Test of turnOff method, of class Lamp.
     */
    @Test
    public void testTurnOff() {
        System.out.println("test turnOff");
        Lamp instance = new Lamp();
        String expResult = "Light on? false";
        String result = instance.turnOff();
    }
    
    /**
     * Test of getState method, of class Lamp.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Lamp instance = new Lamp();
        boolean expResult = false;
        boolean result = instance.getState();
        assertEquals(expResult, result);
        instance.turnOn();
        result =  instance.getState();
        expResult = true;
        assertEquals(expResult, result);
    }
}

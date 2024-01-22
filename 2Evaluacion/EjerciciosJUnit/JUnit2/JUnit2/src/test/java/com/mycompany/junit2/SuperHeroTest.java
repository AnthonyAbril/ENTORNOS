/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junit2;

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
public class SuperHeroTest {
    static SuperHero instance = new SuperHero("superheroe",4 , "Juan", "Volar");
    static SuperHero rival = new SuperHero("villano", 2, "Alberto", "Telequinesis");
    
    public SuperHeroTest() {
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
     * Test of Fight method, of class SuperHero.
     */
    @Test
    public void testFight1() {
        System.out.println("Fight");
        String expResult = "superheroe";
        String result = instance.Fight(rival);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFight2() {
        System.out.println("Fight");
        String expResult = "TIED!";
        String result = instance.Fight(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of addPower method, of class SuperHero.
     */
    @Test
    public void testAddPower1() {
        System.out.println("addPower");
        int increase = 0;
        instance.addPower(increase);
    }
    @Test
    public void testAddPower2() {
        System.out.println("addPower");
        int increase = -1;
        instance.addPower(increase);
    }
    @Test
    public void testAddPower3() {
        System.out.println("addPower");
        int increase = 1;
        instance.addPower(increase);
    }

    /**
     * Test of showProfile method, of class SuperHero.
     */
    @Test
    public void testShowProfile() {
        System.out.println("showProfile");
        SuperHero hero = new SuperHero("superheroe",4 , "Juan", "Volar");
        SuperHero.showProfile(hero);
    }
    
}

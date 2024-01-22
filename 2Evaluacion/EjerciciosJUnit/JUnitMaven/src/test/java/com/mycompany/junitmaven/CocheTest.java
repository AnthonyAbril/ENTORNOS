/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junitmaven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author alumnot
 */
public class CocheTest {
    
    static Coche instance;
    static float descuento;
    
    public CocheTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance = new Coche("Audi A3", 30000f);
        Coche.impuesto = 21f;
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        descuento=0;
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of precioFinal method, of class Coche.
     */
    @Test
    public void testBase() throws Exception {
        System.out.println("test base");
        float descuento = 21.0F;
        
        //Coche instance = new Coche("Audi A3", 3000f);
        float expResult = 3630.0F;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
        
        instance.precioBase = 0;
        expResult = 0;
        result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
        
        instance.precioBase = 59999.99f;
        expResult = 7259.9879f;
        result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.001);
        
        instance.precioBase = -1000;
        expResult = -1210f;
        result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
        
        instance.precioBase = 5000;
        expResult = 6050f;
        result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of precioFinal method, of class Coche.
     */
    @Test
    public void testDisc() throws Exception {
        System.out.println("test with discount");
        float descuento = 21.0F;
        //Coche instance = new Coche("Audi A3", 30000f);
        //Coche.impuesto = 21f;
        float expResult = 28677.0F;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0.001);
    }
    /**
     * Test of precioFinal method, of class Coche.
     */
    @Test
    public void testEx1() throws Exception {
        System.out.println("test exception 1");
        float descuento = -1.0F;
        //Coche instance = new Coche("Audi A3", 30000f);
        //Coche.impuesto = 21f;
        assertThrows(Exception.class, new Executable(){
            @Override
            public void execute() throws Throwable {
                instance.precioFinal(descuento);
            }
        });
    }
    
    /**
     * Test of precioFinal method, of class Coche.
     */
    @Test
    public void testEx2() throws Exception {
        System.out.println("test exception 2");
        float descuento = 1000.0F;
        //Coche instance = new Coche("Audi A3", 30000f);
        //Coche.impuesto = 21f;
        assertThrows(Exception.class, new Executable(){
            @Override
            public void execute() throws Throwable {
                instance.precioFinal(descuento);
            }
        });
    }
}

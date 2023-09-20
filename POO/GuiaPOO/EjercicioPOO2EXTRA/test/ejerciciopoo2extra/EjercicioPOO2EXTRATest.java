/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ejerciciopoo2extra;

import Entity.Puntos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author peras
 */
public class EjercicioPOO2EXTRATest {
    
    public EjercicioPOO2EXTRATest() {
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
    
    /*
     * Test of CalcularDistancia method, of class EjercicioPOO2EXTRA.
     */
    @Test
    public void testCalcularDistancia() {
        System.out.println("CalcularDistancia");
        Puntos punto1 = null;
        Puntos punto2 = null;
        double expResult = 0.0;
        double result = EjercicioPOO2EXTRA.CalcularDistancia(punto1, punto2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
}
    
}

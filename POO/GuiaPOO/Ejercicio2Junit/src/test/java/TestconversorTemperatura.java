/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import entidad.conversorTemperatura;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author peras
 */
public class TestconversorTemperatura {
    
//    public TestconversorTemperatura() {
//    }
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
    conversorTemperatura service = new conversorTemperatura(7.0);
    
    @Test
    public void testFarenheit(){
        service.setTemperaturaC(13.0);
        assertEquals(55.4, service.farenheit());
        
    }
    
//    @Test
//    public void testKelvin(){
//        assertEquals(280.15, service.kelvin());
//    }
    
}

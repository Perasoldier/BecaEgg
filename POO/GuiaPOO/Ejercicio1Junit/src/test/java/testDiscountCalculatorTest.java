/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import entidad.DiscountCalculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author peras
 */
public class testDiscountCalculatorTest {
    
    public testDiscountCalculatorTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    DiscountCalculator calculadora = new DiscountCalculator();
    
    
    @Test
    public void testCalcularDescuento(){
        calculadora.setPrecio(100);
        assertEquals(11.0,calculadora.calcularDescuento(10.0),0);
        
    }
}

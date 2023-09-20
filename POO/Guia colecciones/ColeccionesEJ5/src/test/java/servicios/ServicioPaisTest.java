/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
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
public class ServicioPaisTest {
    
    public ServicioPaisTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
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
     * Test of crearPais method, of class ServicioPais.
     */
    @org.junit.jupiter.api.Test
    public void testCrearPais() {
        System.out.println("crearPais");
        HashSet listadoPaises = null;
        ServicioPais instance = new ServicioPais();
        instance.crearPais(listadoPaises);
        fail("The test case is a prototype.");
    }

    /**
     * Test of creacion method, of class ServicioPais.
     */
    @org.junit.jupiter.api.Test
    public void testCreacion() {
        System.out.println("creacion");
        HashSet listadoPaises = null;
        ServicioPais instance = new ServicioPais();
        instance.creacion(listadoPaises);
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPais method, of class ServicioPais.
     */
    @org.junit.jupiter.api.Test
    public void testEliminarPais() {
        System.out.println("eliminarPais");
        ArrayList<Pais> listadoPaises = null;
        ServicioPais instance = new ServicioPais();
        instance.eliminarPais(listadoPaises);
        fail("The test case is a prototype.");
    }
    
}

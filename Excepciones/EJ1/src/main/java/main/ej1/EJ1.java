/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.ej1;

import entidades.Persona;

/**
 *
 * @author peras
 */
public class EJ1 {

    public static void main(String[] args) {

        Persona p1= new Persona();
        Persona p2= new Persona(-2);
        try {
             Persona p3= new Persona("7");
        } catch (Exception e) {
            System.out.println("A");
        }
        Persona p3= new Persona("7");
        Persona p4= new Persona(17);
        Persona p5= new Persona(19);
        
        System.out.println( p1.esMayorDeEdad()); 
        
        
    }
}

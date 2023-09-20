/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3poo;

import Entidad.Operacion;

/**
 *
 * @author peras
 */
public class Ejercicio3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion ejemplo1 = new Operacion();
        
        ejemplo1.crearOperacion();
        
        ejemplo1.suma();
        ejemplo1.resta();
        ejemplo1.multiplicacion();
        ejemplo1.division();
    }
    
}

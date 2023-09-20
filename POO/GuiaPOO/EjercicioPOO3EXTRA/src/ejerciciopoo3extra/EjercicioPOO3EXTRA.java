/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo3extra;

import Entity.Raices;

/**
 *
 * @author peras
 */
public class EjercicioPOO3EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices primerEjemplo = new Raices(2,4,2);
        System.out.println(primerEjemplo.getDiscriminate());
        System.out.println("Tiene dos raices?: "+primerEjemplo.tieneRaices());
        System.out.println("Tiene solo una raiz?: "+primerEjemplo.tieneRaiz());
        
        primerEjemplo.obtenerRaices();
        
        primerEjemplo.obtenerRaiz();
        
        primerEjemplo.calcular();
    }
    
}

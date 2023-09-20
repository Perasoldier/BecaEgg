/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.relacionesej02;

import entidad.Revolver;

/**
 *
 * @author peras
 */
public class RelacionesEJ02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Revolver cebitas = new Revolver(10, 3);
        System.out.println(cebitas.getPosicion());
        cebitas.siguienteChorro();
        System.out.println(cebitas.getPosicion());
        cebitas.mojar(cebitas);
        cebitas.toStringNew();

    }

}

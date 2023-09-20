/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo6extra;

import Entity.Ahoracado;

/**
 *
 * @author peras
 */
public class EjercicioPOO6EXTRA {

    public static void main(String[] args) {
        Ahoracado juego1 = new Ahoracado();
        
       String palabra = juego1.crearJuego();
        System.out.println(palabra);
        
        juego1.longitud();
        

        juego1.juego(palabra);
    }
    
}

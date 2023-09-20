/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.exepciones05;

import entidades.Juego;

/**
 * Escribir un programa en Java que juegue con el usuario a adivinar un número.
 * La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
 * tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce
 * un valor, la computadora debe decirle al usuario si el número que tiene que
 * adivinar es mayor o menor que el que ha introducido el usuario. Cuando
 * consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de
 * veces que el usuario ha intentado adivinar el número. Si el usuario introduce
 * algo que no es un número, se debe controlar esa excepción e indicarlo por
 * pantalla. En este último caso también se debe contar el carácter fallido como
 * un intento.
 *
 * @author peras
 */
public class Exepciones05 {

    public static void main(String[] args) {
       
//        Juego juego1 = new Juego();
//        System.out.println(juego1);
//        juego1.jugar();


        try {
            Juego juego2 = new Juego(null);
//           juego2.jugar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

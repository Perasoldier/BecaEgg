/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.exepciones02;

import java.util.ArrayList;

/**
 *Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 * @author peras
 */
public class Exepciones02 {

    public static void main(String[] args) {
       ArrayList<Integer> lista = new ArrayList<Integer>(4);
       
       lista.add(1);
       lista.add(2);
       lista.add(3);
       lista.add(4);
       
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println(lista.get(i));
            }
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Te pasaste de rango");
        }
        
       
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Lista;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Diseñar un programa que lea una serie de valores numéricos enteros desde
 * el teclado y los guarde en un ArrayList de tipo Integer. La lectura de
 * números termina cuando se introduzca el valor -99. Este valor no se guarda en
 * el ArrayList. A continuación, el programa mostrará por pantalla el número de
 * valores que se han leído, su suma y su media (promedio).
 *
 * @author peras
 */
public class ServicioLista {

    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> listaNumeros = new ArrayList();

    public Lista agregarNumero() {
        
        int num = 0;
        do {
            System.out.println("Ingrese los numeros, la lectura se interrumpe cuando se ingresa -99");
            num = scan.nextInt();
            if (num != -99) {
                listaNumeros.add(num);
            }
            System.out.println(listaNumeros.toString());
        } while (num != -99);
        
        return ;
    }
}

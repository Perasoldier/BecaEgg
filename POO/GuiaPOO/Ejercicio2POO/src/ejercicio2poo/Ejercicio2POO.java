/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2poo;

import Geometria.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Ejercicio2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia ejemplo1 = new Circunferencia(2);
        
        System.out.println("Area de radio "+(int)ejemplo1.getRadio());
        System.out.println(ejemplo1.area());
        System.out.println("Perimetro de radio "+(int)ejemplo1.getRadio());
        System.out.println(ejemplo1.perimetro());
        
        Circunferencia ejemplo2 = new Circunferencia();
        
        ejemplo2.crearCircunferencia();
        System.out.println("Area de radio "+(int)ejemplo2.getRadio());
        System.out.println(ejemplo2.area());
        System.out.println("Perimetro de radio "+(int)ejemplo2.getRadio());
        System.out.println(ejemplo2.perimetro());

        Circunferencia ejemplo3 = new Circunferencia();
        System.out.println("El radio es:"+ejemplo3.getRadio());
        ejemplo3.setRadio(5);
        System.out.println("Area de radio "+(int)ejemplo3.getRadio());
        System.out.println(ejemplo3.area());
        System.out.println("Perimetro de radio "+(int)ejemplo3.getRadio());
        System.out.println(ejemplo3.perimetro());
    }
    
}


//        Scanner scan = new Scanner(System.in);
//        int radio;
//        System.out.println("Ingrese Valor de Radio:");
//        radio= scan.nextInt();
//        Circunferencia primerDato = new Circunferencia(radio);
        
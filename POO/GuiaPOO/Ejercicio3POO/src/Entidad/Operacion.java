/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void crearOperacion(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero 1:");
        this.numero1 = scan.nextInt();
        System.out.println("Ingrese numero 2:");
        this.numero2 = scan.nextInt();
    }

    public void suma(){
        System.out.println("La suma de los 2 numeros es: "+(this.numero1+this.numero2));
    }
    
    public void resta(){
        System.out.println("La resta de los 2 numeros es: "+(this.numero1-this.numero2));
    }
    
    public void multiplicacion(){
        System.out.println("La multiplicacion de los 2 numeros es: "+(this.numero1*this.numero2));
    }
    
    public int division(){
        
        if (this.numero1==0 || this.numero2==0) {
            System.out.println("Vas a dividir por 0, ERROR");
            return 0;
        }
        System.out.println("La division de los 2 numeros es: "+(this.numero1/this.numero2));
        return this.numero1/this.numero2;
        
    }
    
    
}

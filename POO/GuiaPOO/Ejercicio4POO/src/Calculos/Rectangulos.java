/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculos;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Rectangulos {
    
    private int altura;
    private int base;
    
    public Rectangulos() {
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }
    
    
    
    public void crearRectangulo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese altura de rectangulo:");
        this.altura = scan.nextInt();
        System.out.println("Ingrese Base de rectangulo:");
        this.base = scan.nextInt();
    }
    public void calcularSuperficie(){
        System.out.println("La superficie del rectangulo es: "+(this.base*this.altura));      
    }
    
    public void calcularPerimetro(){
        System.out.println("El perimetro del rectangulo es: "+((this.base+this.altura)*2));
        
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                 System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

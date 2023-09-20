/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Geometria;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Circunferencia {
    Scanner scan = new Scanner(System.in);
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){
        System.out.println("Ingrese Radio:");
        this.radio =this.scan.nextDouble();
    } 
    
    public double area(){
        return PI*(this.radio*this.radio);
    }
    
    public double perimetro(){
        return 2*PI*this.radio;
    }
}

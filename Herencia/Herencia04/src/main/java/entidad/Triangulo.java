/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import interfaces.CalculosFormas;

/**
 *
 * @author peras
 */
public final class Triangulo implements CalculosFormas{
    private int base;
    private int altura;

    public Triangulo() {
    }

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void area() {
            System.out.println("El area del triangulo es: "+((this.base*this.altura)/2));
    }

    @Override
    public void perimetro() {
        
        
        System.out.println("Imaginate la hipotenusa x2 + la base "+this.base);    }
    
    
}

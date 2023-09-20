/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author peras
 */
public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices() {
    }

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
//    
//    Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminate(){
        return ((Math.pow(this.b, 2))-4*this.a*this.c);
    }
//    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(){
        return Math.pow(this.b, 2)-4*this.a*this.c >=0 ;
        
    }
//    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(){
        return Math.pow(this.b, 2)-4*this.a*this.c == 0;
    }
    
    public void obtenerRaices(){
        if (tieneRaices()) {
            System.out.println("Raiz 1: "+(    (this.b*-1)+Math.sqrt(Math.pow(this.b, 2)-(4*this.a*this.c))         /(2*this.a)     ) );
            System.out.println("Raiz 2: "+(    (this.b*-1)-Math.sqrt(Math.pow(this.b, 2)-(4*this.a*this.c))         /(2*this.a)     ) );       
        }
    }
//    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            System.out.println("La unica Raiz es: "+(    (this.b*-1)+Math.sqrt(Math.pow(this.b, 2)-(4*this.a*this.c))         /(2*this.a)     ) );

        }
    }
    
//    Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    
    public void calcular(){
        if (tieneRaiz()) {
            obtenerRaiz();
        } else if (tieneRaices()){
            obtenerRaices();
            } else {
            System.out.println("No tiene solucion!");
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import interfaces.CalculosFormas;

/**
 * Se plantea desarrollar un programa que nos permita calcular el área y el
 * perímetro de formas geométricas, en este caso un círculo y un rectángulo. Ya
 * que este cálculo se va a repetir en las dos formas geométricas, vamos a crear
 * una Interfaz, llamada calculosFormas que tendrá, los dos métodos para
 * calcular el área, el perímetro y el valor de PI como constante. Desarrollar
 * el ejercicio para que las formas implementen los métodos de la interfaz y se
 * calcule el área y el perímetro de los dos. En el main se crearán las formas y
 * se mostrará el resultado final.
 *
 * @author peras
 */
public class Rectangulo extends Formas {

    private int ancho, alto;

    public Rectangulo() {
    }

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "ancho=" + ancho + ", alto=" + alto + '}';
    }

    @Override
    public void area() {
            System.out.println("El area del rectangulo es: "+ (this.alto*this.ancho));
    }

    @Override
    public void perimetro() {
            System.out.println("El perimetro del rectangulo es: "+(2*this.alto+2*this.ancho));
    }


}

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
public class Formas implements CalculosFormas {

    
    @Override
    public void area() {
    }

    @Override
    public void perimetro() {
    }

//    @Override
//    public void areaCirculo(int radio) {
////        Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//        System.out.println("El area del circulos es: " + (pi * radio * radio));
//    }
//
//    @Override
//    public void perimetroCirculo(int radio) {
//        System.out.println("El perimetro del circulo: " + (pi * radio * 2));
//    }
//
//    @Override
//    public void areaRectangulo(Rectangulo rectangulo) {
////Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
//        System.out.println("El area del rectangulo es : " + (rectangulo.getAncho() * rectangulo.getAlto()));
//    }
//
//    @Override
//    public void perimetroRectangulo(int ancho, int alto) {
//        System.out.println("El perimetro del rectangulo es : " + (ancho + alto) * 2);
//    }
//
}

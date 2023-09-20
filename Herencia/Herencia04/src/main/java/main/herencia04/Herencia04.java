/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.herencia04;

import entidad.Circulo;
import entidad.Formas;
import entidad.Rectangulo;
import entidad.Triangulo;

/**
 *Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final. 
 * @author peras
 */
public class Herencia04 {

    public static void main(String[] args) {

        Rectangulo forma1 = new Rectangulo(10, 5);
        Rectangulo forma2 = new Rectangulo(10, 5);
        
        Circulo forma3 = new Circulo(5);
        Circulo forma4 = new Circulo(8);
        
        Triangulo forma5 = new Triangulo(5, 10);
        
//        forma1.area();
//        forma1.perimetro();
//        forma2.area();
//        forma2.perimetro();
//        forma3.area();
//        forma3.perimetro();
//        forma4.area();
//        forma4.perimetro();
        
          forma5.area();
          forma5.perimetro();
        
        
        
        
    }
}

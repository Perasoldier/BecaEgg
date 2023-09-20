/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4poo;

import Calculos.Rectangulos;

/**
 *4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 * @author peras
 */
public class Ejercicio4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulos rec1 = new Rectangulos();
        
        rec1.crearRectangulo();
        
        rec1.calcularSuperficie();
        
        rec1.calcularPerimetro();
        
        rec1.dibujarRectangulo();
        
    }
    
}

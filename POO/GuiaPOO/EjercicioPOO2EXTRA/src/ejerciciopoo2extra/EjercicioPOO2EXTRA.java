/*
2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package ejerciciopoo2extra;

import Entity.Puntos;

/**
 *
 * @author peras
 */
public class EjercicioPOO2EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos punto1 = new Puntos();
        Puntos punto2 = new Puntos();
        double distancia;
        punto1.CrearPuntos();
        punto2.CrearPuntos();
        System.out.println("La distancia entre los dos puntos es: ");
        System.out.println(CalcularDistancia(punto1, punto2));         
         
    }

    public static double CalcularDistancia(Puntos punto1, Puntos punto2) {
        double resultado;
        System.out.println("La distancia entre los 2 puntos es:");
        resultado = Math.sqrt((Math.pow((punto2.getX() - punto1.getX()), 2) + Math.pow((punto2.getY() - punto1.getY()), 2)));

       return resultado;
    }
}

/*
2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Puntos {

    private double x;
    private double y;

    public Puntos() {
    }

    public Puntos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public String toString() {
        return "Puntos{" + "x=" + x + ", y=" + y + ", scan=" + scan + '}';
    }
    
    
    Scanner scan = new Scanner(System.in);
    
    public void CrearPuntos(){
        System.out.println("Ingrese X:");
        this.x = scan.nextInt();
        System.out.println("Ingrese Y:");
        this.y = scan.nextInt();
    }
    
}

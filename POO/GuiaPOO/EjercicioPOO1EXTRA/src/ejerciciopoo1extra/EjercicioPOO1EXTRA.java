/*
1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package ejerciciopoo1extra;

import Entity.Cancion;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class EjercicioPOO1EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cancion cancion1 = new Cancion("Para bailar la bamba","tito");
        
        Cancion cancion2 = new Cancion();
        System.out.println("Ingrese titulo de cancion: ");
        cancion2.setTitulo(scan.nextLine());
        System.out.println("Ingrese autor:");
        cancion2.setAutor(scan.nextLine());
        
        
        System.out.println(cancion1.toString());
        System.out.println(cancion2.toString());
    
        
        
        
    }
    
}

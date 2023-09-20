/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import Entidad.Pelicula;
import Servicio.ServicioPelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 * 4. Un cine necesita implementar un sistema en el que se puedan cargar
 * peliculas. Para esto, tendremos una clase Pelicula con el título, director y
 * duración de la película (en horas). Implemente las clases y métodos
 * necesarios para esta situación, teniendo en cuenta lo que se pide a
 * continuación: En el servicio deberemos tener un bucle que crea un objeto
 * Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto
 * Pelicula. Después, esa Pelicula se guarda una lista de Peliculas y se le
 * pregunta al usuario si quiere crear otra Pelicula o no. Después de ese bucle
 * realizaremos las siguientes acciones:
 *
 * @author peras
 */
public class ColeccionesEJ4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ServicioPelicula sP = new ServicioPelicula();

        Pelicula a = new Pelicula("A", "AA", 0.9);
        Pelicula b = new Pelicula("B", "BB", 1.1);
        Pelicula c = new Pelicula("C", "CC", 2);
        Pelicula d = new Pelicula("D", "DD", 3.1);
        sP.agregarPelicula(a);
        sP.agregarPelicula(b);
        sP.agregarPelicula(c);
        sP.agregarPelicula(d);
//        sP.iniciarCreacion();
        System.out.println(sP.getListadoPelicula().toString());

        for (int i = 0; i < sP.getListadoPelicula().size(); i++) {
            if (sP.getListadoPelicula().get(i).getDuracion() > 1) {
                System.out.println(sP.getListadoPelicula().get(i).toString());

            }
        }
//        • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
        System.out.println("Se ordena de Mayor a menor duracion");
        Collections.sort(sP.getListadoPelicula(), Comparadores.ordenarMayor);
        System.out.println(sP.getListadoPelicula().toString());

        System.out.println("Se ordena de menor a mayor duracion");
        Collections.sort(sP.getListadoPelicula(), Comparadores.ordenarMenor);
        System.out.println(sP.getListadoPelicula().toString());

        System.out.println("Ordenar orden titulo alfabetico ascendente:");
        Collections.sort(sP.getListadoPelicula(), Comparadores.ordenarTituloZa);
        System.out.println(sP.getListadoPelicula().toString());

        System.out.println("Ordenar orden titulo alfabetico descendente:");
        Collections.sort(sP.getListadoPelicula(), Comparadores.ordenarTituloAz);
        System.out.println(sP.getListadoPelicula().toString());

        System.out.println("Ordenar orden Director alfabetico ascendente:");
        Collections.sort(sP.getListadoPelicula(), Comparadores.ordenarDirectorZa);
        System.out.println(sP.getListadoPelicula().toString());

        System.out.println("Ordenar orden titulo alfabetico descendente:");
        Collections.sort(sP.getListadoPelicula(), Comparadores.ordenarDirectorAz);
        System.out.println(sP.getListadoPelicula().toString());
    }
}

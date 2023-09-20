/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author peras
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {

            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {

            return t1.getDuracion().compareTo(t2.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarTituloAz = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {

            return t2.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarTituloZa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {

            return t1.getTitulo().compareTo(t2.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarDirectorAz = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {

            return t2.getDirector().compareTo(t1.getDirector());
        }
    };
    public static Comparator<Pelicula> ordenarDirectorZa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {

            return t1.getDirector().compareTo(t2.getDirector());
        }
    };
}

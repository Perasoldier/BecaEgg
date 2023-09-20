/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class ServicioLibro {

    private HashSet<Libro> listaLibro = new HashSet<Libro>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void agregarLibro() {
        char o;
        

        do {

            System.out.println("Ingrese el titulo");
            String titulo = scan.next();
            System.out.println("Ingrese el autor");
            String autor = scan.next();
            System.out.println("Ingrese la cantidad de ejemplares");
            Integer cant1 = scan.nextInt();
            System.out.println("Ingrese la cantidad de ejemplares prestados");
            Integer cant2 = scan.nextInt();

            listaLibro.add(new Libro(titulo, autor, cant2, cant2));
            System.out.println("Quiere cargar otro libro, ingrese S para si, o N no");
            o = scan.next().toLowerCase().charAt(0);
        } while (o == 's');
    }

    public void mostrarListado() {
        for (Libro libro : listaLibro) {
            System.out.println(libro.toString());
        }
    }
//    
//    Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
//en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
//método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
//prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
//préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
//disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
//caso contrario.
    public void prestamo(){
        mostrarListado();
        System.out.println("Ingrese titulo de libro a prestar:");
    }
    
}

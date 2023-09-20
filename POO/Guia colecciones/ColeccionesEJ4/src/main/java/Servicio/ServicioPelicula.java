/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *4.En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones: 
 * @author peras
 */
public class ServicioPelicula {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listadoPelicula = new ArrayList<>();
    Pelicula p = new Pelicula();
    boolean fin= false ;

    public ArrayList<Pelicula> getListadoPelicula() {
        return listadoPelicula;
    }

    public void setListadoPelicula(ArrayList<Pelicula> listadoPelicula) {
        this.listadoPelicula = listadoPelicula;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public Pelicula getP() {
        return p;
    }

    public void setP(Pelicula p) {
        this.p = p;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }
      
    
    
    public void iniciarCreacion(){
        do {
            System.out.println("Desea crear una pelicula?: S/N");
            String opcion = scan.next();
            if (opcion.equalsIgnoreCase("s")) {
                crearPelicula();
                fin=true;
            }else{
                fin = false;
                System.out.println("FIN DEL PROGRAMA");
            }
            
        } while (fin);
    }
    
    
    public void crearPelicula(){
        System.out.println("Ingrese titulo:");
        String titulo = scan.next(); 
        System.out.println("Ingrese director:");
        String director = scan.next();
        System.out.println("Ingrese duracion:");
        double duracion = scan.nextDouble();
        Pelicula pelicula = new Pelicula(titulo,director,duracion);
        listadoPelicula.add(pelicula);
    }

    public void agregarPelicula(Pelicula x){
        listadoPelicula.add(x);
    }
    
    

    
    @Override
    public String toString() {
        return "ServicioPelicula{" + "scan=" + scan + ", listadoPelicula=" + listadoPelicula + ", p=" + p + ", fin=" + fin + '}';
    }
    
    
}


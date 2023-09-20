/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class ServicioPais {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void crearPais(HashSet listadoPaises) {
        System.out.println("Ingrese nombre pais:");
        Pais x = new Pais(scan.next());
        listadoPaises.add(x);

    }

    public void creacion(HashSet listadoPaises) {
        boolean seguir = false;
        do {
            System.out.println("Desea ingresar un pais?\nS/N");
            String opcion = scan.next();
            if (opcion.equalsIgnoreCase("s")) {
                seguir = true;
                crearPais(listadoPaises);
            } else {
                seguir = false;
            }

        } while (seguir);
    }

    public void eliminarPais(ArrayList<Pais> listadoPaises) {
        System.out.println("Ingrese pais a eliminar:");
        String paisEliminar = scan.next();
        boolean seEncontro= false;
        Iterator<Pais> eliminarPais = listadoPaises.iterator();
        //Metodo Leslie
        while (eliminarPais.hasNext()) {
              if (eliminarPais.next().getNombre().equalsIgnoreCase(paisEliminar)) {
                eliminarPais.remove();
                seEncontro=true;
                System.out.println("El país " + paisEliminar + " ha sido eliminado.");
                
            }  
                        
        }
        if (!seEncontro) {
            System.out.println("No se encontro el pais a buscar");
        } else {    
            escribirArray(listadoPaises);
        }
    
        
    }
    
    
    public void escribirArray(ArrayList<Pais> listadoPaises){
        for (Pais pais : listadoPaises) {
            System.out.println(pais);
        }
    }
}
    
    



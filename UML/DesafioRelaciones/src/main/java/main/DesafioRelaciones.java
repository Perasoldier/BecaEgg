/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import entidad.Producto;
import entidad.Tienda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servicio.servicioProducto;

/**
 *
 * @author peras
 */
public class DesafioRelaciones {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int idTienda=0;
        servicioProducto sP = new servicioProducto();
        ArrayList<Tienda> listadoTiendas = new ArrayList<>();

//        for (int i = 0; i < 3; i++) {
//            listadoTiendas.add(new Tienda().crearTienda());
//        }
        listadoTiendas.add(new Tienda(1, "Av.Rivadavia 2000", "Cucho"));
        listadoTiendas.add(new Tienda(2, "Av.Belgrano", "Plomo"));
        listadoTiendas.add(new Tienda(3, "Av.Directorio", "Santy"));

        Tienda.llenadoTienda(listadoTiendas);

        for (Tienda listadoTienda : listadoTiendas) {
            System.out.println(listadoTienda.getDireccion());
            listadoTienda.mostrarProductos();
        }
//        listadoTiendas.get(1).;
        menu(listadoTiendas,idTienda);

    }

    public static void menu(ArrayList<Tienda> listadoTiendas, int idTienda) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Menu de tiendas: ");
        for (Tienda listadoTienda : listadoTiendas) {
            listadoTienda.mostrarTienda();
        }
        System.out.println("Ingrese id de tienda a trabajar: ");
        idTienda =scan.nextInt();
        
    }

}

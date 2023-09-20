/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Tienda {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void venta(ArrayList<Producto> listaProducto) {
        System.out.println("Ingrese nombre de producto a vender:");
        String producto = scan.next();
        boolean hay = false;

        for (Producto p : listaProducto) {
            if (p.getNombre().equalsIgnoreCase(producto)) {
                hay = true;
                if (p.getStock() > 0) {
                    p.setStock(p.getStock() - 1);
                } else {
                    System.out.println("No hay stock suficiente de " + p.getNombre());
                }

            }
        }
        if (!hay) {
            System.out.println("No se encontro el producto");
        }

    }

    public void reposicion(ArrayList<Producto> listaProducto) {
        System.out.println("Ingrese nombre de producto a reponer:");
        String producto = scan.next();
        boolean hay = false;
        for (Producto p : listaProducto) {
            if (p.getNombre().equalsIgnoreCase(producto)) {
                hay = true;
                p.setStock(p.getStock() + 1);
            }
        }
        if (!hay) {
            System.out.println("No se encontro el producto");
        }

    }

    @Override
    public String toString() {
        return "Tienda{" + "scan=" + scan + '}';
    }
    
    
}

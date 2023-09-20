/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Entidad.Producto;
import Entidad.Tienda;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author peras
 */
public class Main {

 Producto x;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList <Producto> listaProductos = new ArrayList();
        Tienda t= new Tienda();
        String opcion;
//        do {   
//            
//         listaProductos.add(crearProducto());
//            System.out.println("Desea agregar otro producto: S/N?");
//            opcion = scan.next();
//            
//        } while (opcion.equalsIgnoreCase("s"));
        Producto e = new Producto("arroz","comida",200,20);
        Producto f = new Producto("fideos","comida",150,25);
        Producto g = new Producto("tv","electrodomestico",200,30);
        listaProductos.add(e);
        listaProductos.add(f);
        listaProductos.add(g);
        System.out.println(listaProductos.toString());
        
        t.venta(listaProductos);
        
         System.out.println(listaProductos.toString());
         
         t.reposicion(listaProductos);
         
         System.out.println(listaProductos.toString());

        
        
        
    }
    
    
    
    public static Producto crearProducto(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de producto a crear:");
        String nombre = scan.next();
        System.out.println("Ingrese categoria:");
        String categoria = scan.next();
        System.out.println("Ingrese precio:");
        int precio = scan.nextInt();
        System.out.println("Ingrese stock inicial:");
        int stock = scan.nextInt();
        return new Producto(nombre,categoria,precio,stock);
    }
    
    
}

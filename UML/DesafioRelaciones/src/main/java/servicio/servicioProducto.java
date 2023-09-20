/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Producto;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class servicioProducto {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
//  Crear Producto
    public Producto crearProducto() {
        System.out.println("Ingrese Id de Producto: ");
        int id = scan.nextInt();
        System.out.println("Ingrese Nombre: ");
        String nombre = scan.next();
        System.out.println("Ingrese Precio: ");
        Double precio = scan.nextDouble();
        System.out.println("Cuanto stock va a agregar?:");
        int stock = scan.nextInt();
        return new Producto(id, nombre, precio,stock);
    }
//    MostrarProductos()
    public void mostrarProducto(Producto producto){
        System.out.println("Id de Producto: " + producto.getId());
        System.out.println("Nombre de Producto: " + producto.getNombre());
        System.out.println("Precio de Producto: " + producto.getPrecio());
        System.out.println("Stock de Producto: " + producto.getStock());
    }
    

//ModificarProducto()
    public void modificarProducto(Producto producto){
        System.out.println("Indique atributo a modificar");
        System.out.println("1. ID\n2. Nombre\n3. Precio");
        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Cual es el nuevo id:");
                producto.setId(scan.nextInt());
                break;
                 case 2:
                System.out.println("Cual es el nuevo nombre:");
                producto.setNombre(scan.next());
                break;
                 case 3:
                System.out.println("Cual es el nuevo Precio:");
                producto.setPrecio(scan.nextDouble());
                break;
            default:
                System.out.println("Opcion no valida...");
        }
//        mostrarProducto();
        
    }
    
    //EliminarProducto() LO DEJAMOS PARA CUANDO USEMOS LAS ARRAYS
    
}

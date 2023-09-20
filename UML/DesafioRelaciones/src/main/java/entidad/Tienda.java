/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import servicio.servicioProducto;

/**
 * La app, tambien debe contener las diferentes tiendas. Cada tienda, tendrá
 * como atributos: ID de tienda, Lista de productos, direccion, representante de
 * la tienda. Las funciones de la tienda son: CrearTienda() MostrarTiendas()
 * ModificarTienda() EliminarTienda() Además: AgregarProductos(): Agrega el
 * producto elegido y la cantidad. VenderProductos(): Vende cierta cantidad del
 * producto. EliminarProductos(): Elimina el Producto de esa tienda.
 * StockProductos(): Nos devuelve cuantos productos hay.
 *
 * @author peras
 */
public class Tienda {

    private int id;
    private ArrayList<Producto> listadoProductos = new ArrayList<>();
    private String direccion;
    private String manager;
    servicioProducto sP = new servicioProducto();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Tienda() {
    }

    public Tienda(int id, String direccion, String manager) {
        this.id = id;
        this.direccion = direccion;
        this.manager = manager;
    }
//VenderProductos(): Vende cierta cantidad del
// * producto.

    public void mostrarProductos() {
        for (Producto listadoProducto : listadoProductos) {
            sP.mostrarProducto(listadoProducto);
        }
    }

    public Producto buscarId(int id) {
        for (Producto listadoProducto : listadoProductos) {
            if (id == listadoProducto.getId()) {
                return listadoProducto;
            } else {
                System.out.println("Buscando su Producto.....espere");

            }
        }
        return null;
    }

    public void venderProducto() {
        System.out.println("Cual va a vender");
        mostrarProductos();
        System.out.println("Ingrese id:");
        int id = scan.nextInt();
        for (Producto listadoProducto : listadoProductos) {
            if (id == listadoProducto.getId()) {
                System.out.println("Stock disponible:" + listadoProducto.getStock());
                System.out.println("Cantidad vendida: ");
                int cantidad = scan.nextInt();
                listadoProducto.setStock(listadoProducto.getStock() - cantidad);
                System.out.println("Nuevo Stock: " + listadoProducto.getStock());
            }
        }

    }

    public void eliminarProducto() {

        System.out.println("Que producto desea eliminar:");
        mostrarProductos();
        System.out.println("Ingrese id a eliminar");
        int id = scan.nextInt();
        for (Producto listadoProducto : listadoProductos) {
            if (id == listadoProducto.getId()) {
                listadoProductos.remove(listadoProducto);
                break;
            } else {
                System.out.println("Buscando producto....");
            }
        }
    }

    public void modificarProducto() {
        System.out.println("Tome el id:");
        mostrarProductos();

        System.out.println("Ingrese id a modificar:");
        int id = scan.nextInt();

        for (Producto listadoProducto : listadoProductos) {
            if (id == listadoProducto.getId()) {
                sP.modificarProducto(listadoProducto);
            }
        }
    }

    public Tienda crearTienda() {
        System.out.println("Ingrese Id Tienda:");
        int id = scan.nextInt();
        System.out.println("Ingrese Direccion");
        String direccion = scan.next();
        System.out.println("Ingrese Manager:");
        String manager = scan.next();
        return new Tienda(id, direccion, manager);

    }
//     public Tienda(Tienda crearTienda());

    public void mostrarTienda() {
        System.out.println("Id Tienda: " + this.id);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Manager: " + this.manager);

    }

    public void modificarTienda() {
        System.out.println("Indique atributo a modificar de la tienda");
        System.out.println("1. ID\n2. Direccion\n3. Manager");
        int opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Cual es el nuevo id:");
                this.id = scan.nextInt();
                break;
            case 2:
                System.out.println("Cual es la nueva direccion:");
                this.direccion = scan.next();
                break;
            case 3:
                System.out.println("Cual es el nuevo Manager:");
                this.manager = scan.next();
                break;
            default:
                System.out.println("Opcion no valida...");
        }
        mostrarTienda();
    }

    //eliminarTienda(){ queda para despues de que se creen los array de tiendas
//    AgregarProductos(): Agrega el producto elegido y la cantidad.
    public void agregarProducto() {
        this.listadoProductos.add(sP.crearProducto());

    }

    public void agregarProducto(Producto producto) {
        this.listadoProductos.add(producto);

    }

    public void stockProductos() {
        System.out.println("Se muestra a continuacion nombre de producto y cantidad de stock");
        for (Producto listadoProducto : listadoProductos) {
            System.out.println(listadoProducto.getNombre() + ": " + listadoProducto.getStock());
        }
    }
//
    public static void llenadoTienda(ArrayList<Tienda> listadoTienda){
          for (Tienda Tienda : listadoTienda) {
            if (Tienda.getId()==1) {
                Tienda.productos1(Tienda.getListadoProductos());
            }
            if (Tienda.getId()==2) {
                Tienda.productos2(Tienda.getListadoProductos());
            }
            if (Tienda.getId()==3) {
                Tienda.productos3(Tienda.getListadoProductos());
            }
        }
    }
    public void productos1(ArrayList<Producto> listadoProductos) {
        listadoProductos.add(new Producto(1, "Royal Canin", 2000.0, 43));
        listadoProductos.add(new Producto(2, "Tomate", 900.0, 23));
        listadoProductos.add(new Producto(3, "Jabon", 780.0, 56));
        listadoProductos.add(new Producto(4, "Lechuga", 550.0, 33));
        listadoProductos.add(new Producto(5, "Pan", 300.0, 15));
    }
    public void productos2(ArrayList<Producto> listadoProductos) {
        listadoProductos.add(new Producto(1, "Mortadela", 900.0, 87));
        listadoProductos.add(new Producto(2, "Jamon Cocido", 360.0, 45));
        listadoProductos.add(new Producto(3, "Jamon Crudo", 850.0, 27));
        listadoProductos.add(new Producto(4, "Muzzarella", 430.0, 35));
        listadoProductos.add(new Producto(5, "Queso Danbo", 120.0, 31));
    }
    public void productos3(ArrayList<Producto> listadoProductos) {
        listadoProductos.add(new Producto(1, "Arroz", 70.0, 67));
        listadoProductos.add(new Producto(2, "Roast Beef", 1890.0, 34));
        listadoProductos.add(new Producto(3, "Milanesa Cuadrada", 3500.0, 45));
        listadoProductos.add(new Producto(4, "Vacio", 3800.0, 50));
        listadoProductos.add(new Producto(5, "Asado", 1500.0, 99));
    }
 //
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Producto> getListadoProductos() {
        return listadoProductos;
    }

    public void setListadoProductos(ArrayList<Producto> listadoProductos) {
        this.listadoProductos = listadoProductos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.listadoProductos);
        hash = 89 * hash + Objects.hashCode(this.direccion);
        hash = 89 * hash + Objects.hashCode(this.manager);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tienda other = (Tienda) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.manager, other.manager)) {
            return false;
        }
        return Objects.equals(this.listadoProductos, other.listadoProductos);
    }

    @Override
    public String toString() {
        return "Tienda{" + "id=" + id + ", listadoProductos=" + listadoProductos + ", direccion=" + direccion + ", manager=" + manager + '}';
    }

}

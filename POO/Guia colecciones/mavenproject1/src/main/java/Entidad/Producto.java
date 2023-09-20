/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *La clase
Producto debe guardar el nombre del producto, la categoría, el precio y la cantidad en inventario.
 * @author peras
 */
public class Producto {
    private String nombre,categoria;
    private int precio,stock;

    public Producto() {
    }

    public Producto(String nombre, String categoria, int precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + "}\n";
    }
    
    
}

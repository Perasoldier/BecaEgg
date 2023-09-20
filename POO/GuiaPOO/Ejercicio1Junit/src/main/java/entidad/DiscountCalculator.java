/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author peras
 */
public class DiscountCalculator {
    private int precio ;
    
    public double calcularDescuento(double porcentaje){
        
        return this.precio*porcentaje/100;
    }

    public DiscountCalculator() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "DiscountCalculator{" + "precio=" + precio + '}';
    }
    
    
}

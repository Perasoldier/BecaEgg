/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.EnumGimnasio;

/**
 *
 * @author peras
 */
public class Estrellas5 extends Hotel {

    private EnumGimnasio tipo;
    private String NombreRestaurante;
    private int capRestaurante, precioHabitacion5,cantSalonConferencia,cantSuites,cantLimosinas;

    public Estrellas5() {
    }

    public Estrellas5(EnumGimnasio tipo, String NombreRestaurante, int capRestaurante, int cantSalonConferencia, int cantSuites, int cantLimosinas, int cantHanitaciones, int nCamas, int nPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHanitaciones, nCamas, nPisos, nombre, direccion, localidad, gerente);
        this.tipo = tipo;
        this.NombreRestaurante = NombreRestaurante;
        this.capRestaurante = capRestaurante;
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    

    public Estrellas5(EnumGimnasio tipo, String NombreRestaurante, int capRestaurante, int precioHabitacion5, int cantSalonConferencia, int cantSuites, int cantLimosinas, int cantHanitaciones, int nCamas, int nPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantHanitaciones, nCamas, nPisos, nombre, direccion, localidad, gerente);
        this.tipo = tipo;
        this.NombreRestaurante = NombreRestaurante;
        this.capRestaurante = capRestaurante;
        this.precioHabitacion5 = precioHabitacion5;
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo" + tipo + ", NombreRestaurante=" + NombreRestaurante + ", capRestaurante=" + capRestaurante + ", precioHabitacion5=" + precioHabitacion5 + ", cantSalonConferencia=" + cantSalonConferencia + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }
    
//    
//    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//agregado por gimnasio) + (valor agregado por limosinas).
//Donde:
//Valor agregado por el restaurante:
//• $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas.
//• $50 si es mayor de 50.
//Valor agregado por el gimnasio:
//• $50 si el tipo del gimnasio es A.
//• $30 si el tipo del gimnasio es B.
//Valor agregado por las limosinas:
//• $15 por la cantidad de limosinas del hotel.
     @Override
    public void calcularPrecio() {
        int precio = super.precioHabitacion;
        precio += this.cantHanitaciones*this.nCamas ;
         if (this.capRestaurante<30) {
             precio+=10;
         } else if (this.capRestaurante>=30 && this.capRestaurante<=50) {
             precio+=30;
         }else if (this.capRestaurante>50) {
             precio +=50;
         }
         
         if (this.tipo==EnumGimnasio.A) {
             precio+=50;
         }else if (this.tipo==EnumGimnasio.B) {
             precio += 30;
         }
         
         precio+= this.cantLimosinas*15;
         
         this.precioHabitacion5 = precio;
        
    }
    
    
}

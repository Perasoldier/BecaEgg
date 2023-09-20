/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 * @author peras
 */
public class Residencia extends ExtraHotelero{
    private int cantHabitaciones;
    private boolean descuento,campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, int metraje, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metraje, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }
    
    
}

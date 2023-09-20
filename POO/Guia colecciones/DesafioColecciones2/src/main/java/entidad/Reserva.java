/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author peras
 */
// Reserva (ID, Numero de habitación, cantidad de personas, fechas)

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    private int id, numeroHab, cantidadPersonas;
    private LocalDate checkIn, checkOut;
    private ArrayList<Persona> ALP = new ArrayList<>();
    

    public Reserva() {
        System.out.println("Ingrese cantidad de personas:");
        Scanner s = new Scanner(System.in).useDelimiter("\n");
    }

    
    public Reserva(int id, int numeroHab, int cantidadPersonas, LocalDate checkIn, LocalDate checkOut) {
        this.id = id;
        this.numeroHab = numeroHab;
        this.cantidadPersonas = cantidadPersonas;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumeroHab() {
        return numeroHab;
    }
    public void setNumeroHab(int numeroHab) {
        this.numeroHab = numeroHab;
    }
    public int getCantidadPersonas() {
        return cantidadPersonas;
    }
    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    public LocalDate getCheckIn() {
        return checkIn;
    }
    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }
    public LocalDate getCheckOut() {
        return checkOut;
    }
    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }


    @Override
    public String toString() {
        return "Reserva [id=" + id + ", numeroHab=" + numeroHab + ", cantidadPersonas=" + cantidadPersonas
                + ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
    }

    
}
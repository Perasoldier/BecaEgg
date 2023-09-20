/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author peras
 */
public class Alquiler {
    
    private String peliculaAlquilada;
    private Date fechaInicio;
    private Date fechaInicioFin;
    private int precio;
    private String[] peliculasAlquiladas = new String[3];
    
    public Alquiler() {
    }

    public Alquiler(String peliculaAlquilada, Date fechaInicio, Date fechaInicioFin, int precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaInicioFin = fechaInicioFin;
        this.precio = precio;
    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaInicioFin() {
        return fechaInicioFin;
    }

    public void setFechaInicioFin(Date fechaInicioFin) {
        this.fechaInicioFin = fechaInicioFin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
    


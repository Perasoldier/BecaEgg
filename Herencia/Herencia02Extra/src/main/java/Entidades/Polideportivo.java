/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author peras
 */
public final class Polideportivo extends Edificio {

    private String nombre;
    private boolean tipoDeInstalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tipoDeInstalacion) {
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public Polideportivo(String nombre, boolean tipoDeInstalacion, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(boolean tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "nombre=" + nombre + ", tipoDeInstalacion=" + tipoDeInstalacion + '}';
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del Polideportivo es: " + (this.ancho * this.largo) + " metros cuadrados.");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del Polideportivo es: " + (this.alto * this.ancho * this.largo) + " metros cúbicos.");
    }

}

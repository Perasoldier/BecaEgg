/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author peras
 */
public final class EdificioDeOficinas extends Edificio {

    private String nombre;
    private int numeroDeOficinas;
    private int personasPorOficina;
    private int numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numeroDeOficinas, int personasPorOficina, int numeroDePisos) {
        this.numeroDeOficinas = numeroDeOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public EdificioDeOficinas(String nombre, int numeroDeOficinas, int personasPorOficina, int numeroDePisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.numeroDeOficinas = numeroDeOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
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
        return "EdificioDeOficinas{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "numeroDeOficinas=" + numeroDeOficinas + ", personasPorOficina=" + personasPorOficina + ", numeroDePisos=" + numeroDePisos + '}';
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del Edificio de Oficinas es: " + (this.ancho * this.largo) + " metros cuadrados.");
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del Edificio de Oficinas es: " + (this.alto * this.ancho * this.largo) + " metros cúbicos.");
    }

    public void cantPersonas() {
        System.out.println("En el edificio entran " + (this.numeroDePisos * this.personasPorOficina) + " personas.");
    }
}

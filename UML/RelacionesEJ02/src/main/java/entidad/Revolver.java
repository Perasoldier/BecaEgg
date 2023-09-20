/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición
 * actual (posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (la posición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente.
 *
 * @author peras
 */
public class Revolver {

    private int posicion;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicion, int posicionAgua) {
        this.posicion = posicion;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void toStringNew(){
        System.out.println("Posicion de Tambor: " + this.posicion);
        System.out.println("Posicion Agua: " + this.posicionAgua);
}

    public void llenarRevolver() {
        double pos = Math.random() * 10;
        Math.round(pos);
        if (pos > 0 && pos < 11) {
            this.posicion = (int) pos;
        } else {
            llenarRevolver();
        }
        double posAgua = Math.random() * 10;
        Math.round(pos);
        if (pos > 0 && pos < 11) {
            this.posicion = (int) posAgua;
        } else {
            llenarRevolver();
        }

    }

    public boolean mojar(Revolver revolver) {
        return (this.posicion == this.posicionAgua);
    }

    public void siguienteChorro() {
        if (this.posicion == 10) {
            this.posicion = 1;
        } else {
            this.posicion = this.posicion + 1;
        }

    }
}

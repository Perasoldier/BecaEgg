/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author peras
 */
public abstract class Familia {
    protected String direccion;
    protected int ide;
    protected int nDeLote;
    protected String barrio;
    protected String localidad;

    public Familia() {
    }

    public Familia(String direccion, int ide, int nDeLote, String barrio, String localidad) {
        this.direccion = direccion;
        this.ide = ide;
        this.nDeLote = nDeLote;
        this.barrio = barrio;
        this.localidad = localidad;
    }
    
    
}

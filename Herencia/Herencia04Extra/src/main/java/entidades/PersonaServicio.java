/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enumClases.Secciones;

/**
 *
 * @author peras
 */
public class PersonaServicio extends Empleado {

    private Secciones seccion;

    public PersonaServicio() {
    }

    public PersonaServicio(Secciones seccion) {
        this.seccion = seccion;
    }

    public PersonaServicio(Secciones seccion, int anio, int nDespacho) {
        super(anio, nDespacho);
        this.seccion = seccion;
    }

    public PersonaServicio(Secciones seccion, int anio, int nDespacho, String nombre, String apellido, String id, String estadoCivil) {
        super(anio, nDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public void setSeccion(Secciones seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
       return super.toString() + "PersonaServicio{" + "seccion=" + seccion + '}';
    }
    
    
}

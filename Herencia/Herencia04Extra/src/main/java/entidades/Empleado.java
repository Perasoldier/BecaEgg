/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**

• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.

 * @author peras
 */
public class Empleado extends Persona {
    protected int anio;
    protected int nDespacho;

    public Empleado() {
    }

    public Empleado(int anio, int nDespacho) {
        this.anio = anio;
        this.nDespacho = nDespacho;
    }

    public Empleado(int anio, int nDespacho, String nombre, String apellido, String id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anio = anio;
        this.nDespacho = nDespacho;
    }

    public void setnDespacho(int nDespacho) {
        this.nDespacho = nDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "anio=" + anio + ", nDespacho=" + nDespacho + '}';
    }
    
    
    
}

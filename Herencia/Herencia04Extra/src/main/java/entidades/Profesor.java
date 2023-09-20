/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * • Por lo que se refiere a los profesores, es necesario gestionar a qué
 * departamento pertenecen (lenguajes, matemáticas, arquitectura, ...). • Sobre
 * el personal de servicio, hay que conocer a qué sección están asignados
 * (biblioteca, decanato, secretaría, ...). El ejercicio consiste, en primer
 * lugar, en definir la jerarquía de clases de esta aplicación. A continuación,
 * debe programar las clases definidas en las que, además de los constructores,
 * hay que desarrollar los métodos correspondientes a las siguientes
 * operaciones: • Cambio del estado civil de una persona. • Reasignación de
 * despacho a un empleado. • Matriculación de un estudiante en un nuevo curso. •
 * Cambio de departamento de un profesor. • Traslado de sección de un empleado
 * del personal de servicio. • Imprimir toda la información de cada tipo de
 * individuo. Incluya un programa de prueba que instancie objetos de los
 * distintos tipos y pruebe los métodos desarrollados.
 *
 * @author peras
 */
public final class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento) {
        this.departamento = departamento;
    }

    public Profesor(String departamento, int anio, int nDespacho) {
        super(anio, nDespacho);
        this.departamento = departamento;
    }

    public Profesor(String departamento, int anio, int nDespacho, String nombre, String apellido, String id, String estadoCivil) {
        super(anio, nDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "departamento=" + departamento + '}';
    }

}

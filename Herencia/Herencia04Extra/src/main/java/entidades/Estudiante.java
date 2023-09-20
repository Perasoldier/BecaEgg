/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author peras
 */
public class Estudiante extends Persona {

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso) {
        this.curso = curso;
    }

    public Estudiante(String curso, String nombre, String apellido, String id, String estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "curso=" + curso + '}';
    }

}

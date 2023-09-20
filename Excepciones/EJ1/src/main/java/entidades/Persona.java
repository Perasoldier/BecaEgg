/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author peras
 */
public class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + '}';
    }
    
    
    
    public boolean esMayorDeEdad(){
        if (this.edad>18) {
            return true;
        }else {
            return false;
        }
    }
}

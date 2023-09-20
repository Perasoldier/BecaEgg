/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.relacionesej01;

import entidad.Perro;
import entidad.Persona;

/**
 *1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 * @author peras
 */
public class RelacionesEJ01 {

    public static void main(String[] args) {
      
        Persona persona1 = new Persona("Santy", "Peralta", 30, 37206319, new Perro());
        Persona persona2 = new Persona("Rochi", "Lapasta", 22, 49839507, new Perro());
        Perro perro1 = new Perro("Cachilo","Puroperro", "chico", 7);
        Perro perro2 = new Perro("Pepe","Dogo", "grande", 5);
        
        System.out.println(persona1.getMascota().toString());
        
        persona1.setMascota(perro1);
        persona2.setMascota(perro2);
        
        System.out.println(persona1.getMascota().toString());
        
        System.out.println(persona2.getMascota().toString());
        
        
        System.out.println("........");
        System.out.println(persona1.toString());
        
        persona1.getMascota().setNombre("Ivanwoof");
        
        System.out.println("Se cambia nombre de mascota a persona 1");
        System.out.println(persona1);
        
        
    }
}

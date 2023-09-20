/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.herencia04extra;

import entidades.Estudiante;
import entidades.PersonaServicio;
import entidades.Profesor;
import enumClases.Secciones;

/**
 *Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados. 
 * @author peras
 */
public class Herencia04Extra {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("5k1", "Pablo", "Mosconi", "A3312", "Soltero");
        
        PersonaServicio ps1 = new PersonaServicio(Secciones.DECANATO, 2019, 0, "Santiago", "Lopez", "P201", "Casado");
        Profesor pr1 = new Profesor("cs", 2017, 233, "Magali", "Peraz", "A4567", "soltera");
        System.out.println(e1.toString());
        System.out.println(ps1.toString());
        System.out.println(pr1.toString());
        
        pr1.setEstadoCivil("viudo");
        ps1.setnDespacho(3312);
        e1.setCurso("5k3");
        ps1.setSeccion(Secciones.PROFESOR);
        
        System.out.println(e1.toString());
        System.out.println(ps1.toString());
        System.out.println(pr1.toString());
        
    }
}

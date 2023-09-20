/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class ServicioAlumno {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaAlumnos = new ArrayList();

//Se pide toda la información al usuario
    public Alumno crearAlumno() {
        System.out.println("Ingrese nombre");
        String nombre = scan.next();

        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese primer nota");
        notas.add(scan.nextInt());
        System.out.println("Ingrese segunda nota");
        notas.add(scan.nextInt());
        System.out.println("Ingrese tercer nota");
        notas.add(scan.nextInt());

        return new Alumno(nombre, notas);
    }
//Ese Alumno se guarda en una lista de tipo Alumno

    public void agregarAlumno() {
        listaAlumnos.add(crearAlumno());
        System.out.println("El alumno ha sido agregado a la lista satisfactoriamente!");
    }

//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
//se le pregunta al usuario si quiere crear otro Alumno o no.
    public void generadorAlumno() {
        boolean respuesta;
        do {
            System.out.println("Desea crear un alumno?:\nS/N");
            if (scan.next().equalsIgnoreCase("s")) {
                respuesta = true;
                agregarAlumno();
            } else {
                respuesta = false;
                System.out.println("Se dejan de crear alumnos");
            }
        } while (respuesta);
    }
//    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.

    public double notaFinal() {
        double notafinal = 0;
        System.out.println("Ingrese nombre a buscar:");
        String nombre = scan.next();

        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().matches(nombre)) {
//                
                for (int j = 0; j < listaAlumnos.get(i).getNotas().size(); j++) {
                    notafinal += listaAlumnos.get(i).getNotas().get(i);
                }
            }
        
            System.out.println("");

        }

        return notafinal/3;
    }

    @Override
    public String toString() {
        return "Los alumnos almacenados son: \n" + listaAlumnos;
    }

}



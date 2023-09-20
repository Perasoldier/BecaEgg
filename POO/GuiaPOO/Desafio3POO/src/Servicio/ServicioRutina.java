/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class ServicioRutina {
    
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Rutina> listadoRutina = new ArrayList<>();

    static int contador = 0;

    public void registrarRutina() {
//        Cliente c = new Cliente();

        Rutina r1 = new Rutina(++contador,"Aerobico",60,"Facil","Esta facilongo.");
        Rutina r2 = new Rutina(++contador,"Musculacion",45,"Dificil","Esta duro esto.");

//        System.out.println("Ingrese el ID del cliente: ");
//        c.setId(++contador);
//        
//        System.out.println("Ingrese nombre del cliente: ");
//        c.setNombre(scan.nextLine());
//        
//        System.out.println("Ingrese edad del cliente: ");
//        c.setEdad(scan.nextInt());
//        
//        System.out.println("Ingrese altura del cliente: ");
//        c.setAltura(scan.nextDouble());
//        
//        System.out.println("Ingrese peso del cliente: ");
//        c.setPeso(scan.nextDouble());
//        
//        System.out.println("Ingrese el objetivo del cliente: ");
//        c.setObjetivo(scan.nextLine());
        listadoRutina.add(r1);
        listadoRutina.add(r2);
//        return c;
    }

    public static void obtenerRutina() {
        for (int i = 0; i < listadoRutina.size(); i++) {
            System.out.println(listadoRutina.get(i).toString());
        }

    }

    public void actualizarRutina() {

        System.out.println("Ingrese el ID que desea actualizar");
        int respuesta = scan.nextInt();
        boolean bandera = false;
        for (int i = 0; i < listadoRutina.size(); i++) {
            if (listadoRutina.get(i).getId() == respuesta) {
                bandera = true;
                System.out.println("Que dato desea actualizar? Ingrese el numero correspondiente: \n1. Nombre\n2. Duracion\n3. Dificultad\n4. Descripcion");
                int opcion = scan.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        listadoRutina.get(i).setNombre(scan.next());
                        System.out.println("Se ha actualizado el dato.");
                        break;
                    case 2:
                        System.out.println("Ingrese la nueva duracion:");
                        listadoRutina.get(i).setDuracion(scan.nextInt());
                        System.out.println("Se ha actualizado el dato.");
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva dificultad:");
                        listadoRutina.get(i).setNivelDificultad(scan.next());
                        System.out.println("Se ha actualizado el dato.");
                        break;
                    case 4:
                      System.out.println("Ingrese la nueva descripcion:");
                        listadoRutina.get(i).setDescripcion(scan.nextLine());
                        System.out.println("Se ha actualizado el dato.");
                        break;
       
                    default:
                        System.out.println("Tocaste cualquier cosa, querido");
                        break;
                }
                break;
            }
        }
        if (!bandera) {
            System.out.println("No se encontro el ID buscado");
        }
    }

    public void eliminarRutina() {
        System.out.println("Que cliente desea eliminar:");
        int respuesta = scan.nextInt();
        boolean bandera = false;
        
        for (int i = 0; i < listadoRutina.size(); i++) {
            if (listadoRutina.get(i).getId() == respuesta) {
                bandera = true;
                listadoRutina.remove(listadoRutina.get(i));
                break;
            }
        }
        if (!bandera) {
            System.out.println("No se encontro el ID buscado");
        }
    }
}



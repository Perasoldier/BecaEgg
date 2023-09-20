/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import entidad.Habitacion;
import java.util.Scanner;

/**
 // Un hotel está alquilando habitaciones, y en esta temporada decidió realizar las reservas desde internet. el
// hotel cuenta con 10 Habitaciones, de las cuales:


// Realizar un programa en donde se muestren la siguiente información:

// Se debe realizar un CRUD que sea necesario. (Crear, Leer, Modificar o Eliminar)
// El programa debe tener un menú para las diferentes opciones.
// Podrás crear los métodos que sean necesarios para que el programa sea más completo.
// Se deberá subir a GitHub y compartir entre integrantes del mismo equipo.
// Se deberán realizar las pruebas unitarias en JUnit para los métodos creados. (Solo si sobra tiempo)
 * @author peras
 */
public class DesafioColecciones2 {

    public static void main(String[] args) {
   Scanner s = new Scanner(System.in).useDelimiter("\n");
        // Crear 10 habitaciones
        Habitacion h = new Habitacion();
        
        menu:
        while(true){
            System.out.println("Ingrse opcion:");
            System.out.println("1.- Modificar Persona\n2.- ???\n9.- Salir");
            int opcion = s.nextInt();
            switch(opcion){
                case 1: 

                break;
                case 9: 
                break menu;
                default: 
                    System.out.println("opcion incorrecta.");
            }
        }
        
    }
}
    


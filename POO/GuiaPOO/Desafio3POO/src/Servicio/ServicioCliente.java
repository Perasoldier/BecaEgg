/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class ServicioCliente {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<Cliente> listadoClientes = new ArrayList<>();

    static int contador = 0;

    public void registrarCliente() {
//        Cliente c = new Cliente();

        Cliente c1 = new Cliente(++contador, "Pablo", 22, 1.80, 80, "Estar mamado");
        Cliente c2 = new Cliente(++contador, "Pedro", 25, 1.72, 76, "Estar como Pablo");

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
        listadoClientes.add(c1);
        listadoClientes.add(c2);
//        return c;
    }

    public static void obtenerClientes() {
        for (int i = 0; i < listadoClientes.size(); i++) {
            System.out.println(listadoClientes.get(i).toString());
        }

    }

    public void actualizarCliente() {

        System.out.println("Ingrese el ID que desea actualizar");
        int respuesta = scan.nextInt();
        boolean bandera = false;
        for (int i = 0; i < listadoClientes.size(); i++) {
            if (listadoClientes.get(i).getId() == respuesta) {
                bandera = true;
                System.out.println("Que dato desea actualizar? Ingrese el numero correspondiente: \n1. Nombre\n2. Edad\n3. Altura\n4. Peso\n5. Objetivo");
                int opcion = scan.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nuevo nombre:");
                        listadoClientes.get(i).setNombre(scan.next());
                        System.out.println("Se ha actualizado el dato.");
                        break;
                    case 2:
                        System.out.println("Ingrese la nueva edad:");
                        listadoClientes.get(i).setEdad(scan.nextInt());
                        System.out.println("Se ha actualizado el dato.");
                        break;
                    case 3:
                        System.out.println("Ingrese la nueva altura:");
                        listadoClientes.get(i).setAltura(scan.nextDouble());
                        System.out.println("Se ha actualizado el dato.");
                        break;
                    case 4:
                        System.out.println("Ingrese el nuevo peso:");
                        listadoClientes.get(i).setPeso(scan.nextDouble());
                        System.out.println("Se ha actualizado el dato.");
                        break;
                    case 5:
                        System.out.println("Ingrese el nuevo objetivo:");
                        listadoClientes.get(i).setObjetivo(scan.nextLine());
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

    public void eliminarCliente() {
        System.out.println("Que cliente desea eliminar:");
        int respuesta = scan.nextInt();
        boolean bandera = false;
        
        for (int i = 0; i < listadoClientes.size(); i++) {
            if (listadoClientes.get(i).getId() == respuesta) {
                bandera = true;
                listadoClientes.remove(listadoClientes.get(i));
                break;
            }
        }
        if (!bandera) {
            System.out.println("No se encontro el ID buscado");
        }
    }
}

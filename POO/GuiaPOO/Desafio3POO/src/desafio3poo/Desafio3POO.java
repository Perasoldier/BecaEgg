/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio3poo;

import Servicio.ServicioCliente;
import Servicio.ServicioRutina;

/**
 *
 * @author peras
 */
public class Desafio3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioCliente sC = new ServicioCliente();
        ServicioRutina sR = new ServicioRutina();

        sR.registrarRutina();
        ServicioRutina.obtenerRutina();
        sR.actualizarRutina();
        ServicioRutina.obtenerRutina();
        sR.eliminarRutina();
        ServicioRutina.obtenerRutina();
//        sC.registrarCliente();
//        sC.obtenerClientes();
//        sC.actualizarCliente();
//        sC.obtenerClientes();
//        sC.eliminarCliente();
//        sC.obtenerClientes();
    }
    
}

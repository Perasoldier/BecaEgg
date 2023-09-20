/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.relacionesej4extra;

import Entidades.Simulador;
import Utils.Comparadores;
import java.util.Collections;

/**
 *
 * @author peras
 */
public class RelacionesEJ4Extra {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulador s = new Simulador();
	
		s.generarListado(); 
		s.generarDnis(); 
		s.crearAlumnos();
		s.votacion(s.getAlumnos());
		System.out.println(s.getAlumnos());
		Collections.sort(s.getAlumnos(), Comparadores.ordenarMayor);
                System.out.println(s.getAlumnos());
		Collections.sort(s.getAlumnos(), Comparadores.ordenarVotoMax);
		System.out.println(s.getAlumnos().toString());
                
               s.votaciones();
	}

}


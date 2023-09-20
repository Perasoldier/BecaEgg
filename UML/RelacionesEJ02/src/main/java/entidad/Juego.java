/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author peras
 */
public class Juego {
    private ArrayList<Jugador> listadoJugadores= new ArrayList<>();
    private Revolver smith;
    
    
    
    
    private void llenarJuego(ArrayList<Jugador> listado, Revolver smith){
        listado.add(new Jugador(1, "Jugador "));
        listado.add(new Jugador(2, "Jugador "));
        listado.add(new Jugador(3, "Jugador "));
        listado.add(new Jugador(4, "Jugador "));
        listado.add(new Jugador(5, "Jugador "));
        listado.add(new Jugador(6, "Jugador "));
        
        smith.llenarRevolver();
        
    }
    
    private void ronda(){
        for (Jugador listadoJugadore : listadoJugadores) {
      listadoJugadore.disparo(smith);
            if (listadoJugadore.isMojado()) {
                
            }

        }
    }
}

//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.

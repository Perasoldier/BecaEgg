/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author peras
 */
public class Comparadores {
    public static Comparator <Pais> ordenAscendente = new Comparator<Pais>(){
        @Override
        public int compare(Pais t1, Pais t2) {

            return t2.getNombre().compareTo(t1.getNombre());
        }
        };
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Objects;

/**
 *                            EJERCICIO 1 EXTRA
 * @author peras
 */
public class Lista {
   private ArrayList<Integer> numeros = new ArrayList();

    public Lista() {
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Lista{" + "numeros=" + numeros + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.numeros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lista other = (Lista) obj;
        return Objects.equals(this.numeros, other.numeros);
    }
//
//   menu:
//while(true){
//pedir num
//if num == -99 break menu;
//else agrégalo a la lista
//}
//   
    
}

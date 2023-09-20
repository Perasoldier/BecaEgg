package Entidad;


import java.util.ArrayList;
import java.util.Iterator;

public class Perros {
    private ArrayList<String> razas = new ArrayList<String>();
    public void add(String raza){
        razas.add(raza);
    }
    public void razas(){
        for (String string : razas) {
            System.out.println(string);
        }
    }
    public String toStringg(){
         return razas.toString();
        // String r = "[";
        // for (String string : razas) {
        //     r += string + ", ";
        // }
        // r = r.substring(0, r.length()-2);
        // r += "]";
        // return r;
    }

    public void eliminarMscota(String opcion) {
        Iterator<String> iterator = razas.iterator();
        boolean encontrado = false;
        
        while (iterator.hasNext()) {
            String raza = iterator.next();
            if (raza.equalsIgnoreCase(opcion)) {
                iterator.remove();
                encontrado = true;
            
            }
        }
      }

    }


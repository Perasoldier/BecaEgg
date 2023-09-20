package Main;


// Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
// programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
// después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
// salir, se mostrará todos los perros guardados en el ArrayList.
//
//
//2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.

import Entidad.Perros;
import java.util.Iterator;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Perros p = new Perros();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese una raza de perro: ");
            String raza = s.nextLine();
            p.add(raza);
            System.out.println("Desea ingresar otra raza? (s/n)");
            String respuesta = s.nextLine();
            if(respuesta.equals("n")){
                break;
            }
        }
        p.razas();
//        
//        System.out.println("################################");
//        System.out.println(p.toStringg());
//      
        System.out.println("Que raza quiere aniquilar:");
        String opcion= s.nextLine();
        
        p.eliminarMscota(opcion);
        p.razas();
    }
}

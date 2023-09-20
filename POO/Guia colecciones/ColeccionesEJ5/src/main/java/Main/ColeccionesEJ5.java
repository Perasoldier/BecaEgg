/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Main;

import entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import servicios.ServicioPais;
import utilidades.Comparadores;

/**
 * 5. Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 * @author peras
 */
public class ColeccionesEJ5 {

    public static void main(String[] args) {
        ServicioPais sP = new ServicioPais();

        LinkedHashSet<Pais> listadoPaises = new LinkedHashSet<>();
        listadoPaises.add(new Pais("Argentina"));
        listadoPaises.add(new Pais("Brasil"));
        listadoPaises.add(new Pais("Brasil"));
        listadoPaises.add(new Pais("Chile"));
        listadoPaises.add(new Pais("Uruguay"));
//        sP.creacion(listadoPaises);
//        sP.crearPais(listadoPaises);
        System.out.println(listadoPaises.toString());
        System.out.println("hola1");

        ArrayList<Pais> listadoPaisArray = new ArrayList<Pais>(listadoPaises);
//        System.out.println(listadoPaisArray.toString());
//        TreeSet<Pais> listadoPaisesTree = new TreeSet<Pais>(listadoPaises);

        Collections.sort(listadoPaisArray, Comparadores.ordenAscendente);
        System.out.println("Se ordena Ascendente:");
        for (Pais pais : listadoPaisArray) {
            System.out.println(pais);
        }
//        System.out.println(listadoPaisesTree.toString());

        sP.eliminarPais(listadoPaisArray);

    }

}

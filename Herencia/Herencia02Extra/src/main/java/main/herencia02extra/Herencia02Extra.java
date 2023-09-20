/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.herencia02extra;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 * 2. Crear una superclase llamada Edificio con los siguientes atributos: ancho,
 * alto y largo. La clase edificio tendrá como métodos: • Método
 * calcularSuperficie(): calcula la superficie del edificio. • Método
 * calcularVolumen(): calcula el volumen del edifico. Estos métodos serán
 * abstractos y los implementarán las siguientes clases: • Clase Polideportivo
 * con su nombre y tipo de instalación que puede ser Techado o Abierto, esta
 * clase implementará los dos métodos abstractos y los atributos del padre. •
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de
 * personas por oficina y número de pisos. Esta clase implementará los dos
 * métodos abstractos y los atributos del padre. De esta clase nos interesa
 * saber cuántas personas pueden trabajar en todo el edificio, el usuario dirá
 * cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
 * (suponiendo que en cada piso hay una oficina). Crear el método
 * cantPersonas(), que muestre cuantas personas entrarían en un piso y cuantas
 * en todo el edificio. 16 Por último, en el main vamos a crear un ArrayList de
 * tipo Edificio. El ArrayList debe contener dos polideportivos y dos edificios
 * de oficinas. Luego, recorrer este array y ejecutar los métodos
 * calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
 * superficie y el volumen de cada edificio. Además de esto, para la clase
 * Polideportivo nos interesa saber cuántos polideportivos son techados y
 * cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al
 * método cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 *
 * @author peras
 */
public class Herencia02Extra {

    public static void main(String[] args) {
        ArrayList<Edificio> listadoEdificios = new ArrayList<>();

        listadoEdificios.add(new Polideportivo("Poli Uno", true, 20, 50, 30));
        listadoEdificios.add(new Polideportivo("Poli Dos", false, 40, 100, 60));
        listadoEdificios.add(new EdificioDeOficinas("Edificio Uno", 5, 30, 5, 40, 80, 30));
        listadoEdificios.add(new EdificioDeOficinas("Edificio Dos", 7, 35, 7, 80, 100, 50));

        for (Edificio edificio : listadoEdificios) {
            if (edificio instanceof Polideportivo) {
                System.out.println("Nombre: " + ((Polideportivo) edificio).getNombre());
                if (((Polideportivo) edificio).isTipoDeInstalacion()) {
                    System.out.println("Es techado");
                }
            }
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println("Nombre: " + ((EdificioDeOficinas) edificio).getNombre());
                ((EdificioDeOficinas) edificio).cantPersonas();
            }
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
        }
    }
}

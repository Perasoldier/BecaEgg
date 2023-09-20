/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.herencia02;

import entidad.Electrodomestico;
import entidad.Lavarropas;
import entidad.Televisor;
import java.util.ArrayList;

/**
 * 3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
 * Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
 * televisores, con valores ya asignados. Luego, recorrer este array y ejecutar
 * el método precioFinal() en cada electrodoméstico. Se deberá también mostrar
 * el precio de cada tipo de objeto, es decir, el precio de todos los
 * televisores y el de las lavadoras. Una vez hecho eso, también deberemos
 * mostrar, la suma del precio de todos los Electrodomésticos. Por ejemplo, si
 * tenemos una lavadora con un precio de 2000 y un televisor de 5000, el
 * resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para
 * lavadora y 5000 para televisor
 *
 * @author peras
 */
public class Herencia02 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> listaElectro = new ArrayList();

        listaElectro.add(new Televisor(45, true, 1000.0, 15.0, "blanco", 'b'));
        listaElectro.add(new Televisor(65, true, 1000.0, 22.0, "rojo", 'a'));
        listaElectro.add(new Lavarropas(8.0, 1000.0, 88.9, "azul", 'c'));
        listaElectro.add(new Lavarropas(10.0, 1000.0, 90.9, "negro", 'a'));
        
        
        
        
        System.out.println(listaElectro.get(0));
        listaElectro.get(0).preciofinal();
        System.out.println("Se imprime lista de productos: \n");
        for (Electrodomestico electrodomestico : listaElectro) {
            System.out.println(electrodomestico.toString());
        }
        System.out.println("\nSe Procede a calcular el precio final...");

        for (Electrodomestico electrodomestico : listaElectro) {
            if (electrodomestico instanceof Lavarropas) {
                ((Lavarropas) electrodomestico).precioFinalLavarropas();
            }
            if (electrodomestico instanceof Televisor) {
                ((Televisor) electrodomestico).precioFinalTelevisor();
            }
        }

        for (Electrodomestico electrodomestico : listaElectro) {
            System.out.println(electrodomestico.toString());
        }
        System.out.println("\nSe Procede a mostrar precio acumulado por categoria:\n");
        
        Double totalLavarropas = 0.0;
        Double totalTelevisor = 0.0;

        for (Electrodomestico electrodomestico : listaElectro) {
            if (electrodomestico instanceof Lavarropas) {
                totalLavarropas = totalLavarropas + ((Lavarropas) electrodomestico).getPrecio();
            }

            if (electrodomestico instanceof Televisor) {
                totalTelevisor = totalTelevisor + ((Televisor) electrodomestico).getPrecio();
            }
        }
        System.out.println("Suma total precio televisores: $"+totalTelevisor);
        System.out.println("Suma total precio lavarropas: $"+totalLavarropas);
        System.out.println("\nSuma total inventario: $"+(totalLavarropas+totalTelevisor));

        
        System.out.println("qwerertyuiiomnbvcvvcxVZcxvCzxjkhgjhgjhsssddaaaa{ñl{ñlkjhhfhgdgffsdASFAFGASG123456789");
    }
}

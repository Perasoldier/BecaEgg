/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio2junit;

import entidad.conversorTemperatura;

/**
 *2. Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.
 * @author peras
 */
public class Ejercicio2Junit {

    public static void main(String[] args) {
        conversorTemperatura ej1 = new conversorTemperatura(13.0);
        System.out.println("farenheit");
        System.out.println(ej1.farenheit());
        
    }
}

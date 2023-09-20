/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.herencia03extra;

import entidades.Camping;
import entidades.Estrellas4;
import entidades.Estrellas5;
import entidades.Hotel;
import entidades.Residencia;
import enums.EnumGimnasio;
import java.util.ArrayList;

/**
 *
 * El precio de una habitación debe calcularse de acuerdo con la siguiente
 * fórmula: PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor
 * agregado por restaurante) + (valor agregado por gimnasio) + (valor agregado
 * por limosinas). Donde: Valor agregado por el restaurante: • $10 si la
 * capacidad del restaurante es de menos de 30 personas. • $30 si está entre 30
 * y 50 personas. • $50 si es mayor de 50. Valor agregado por el gimnasio: • $50
 * si el tipo del gimnasio es A. • $30 si el tipo del gimnasio es B. Valor
 * agregado por las limosinas: • $15 por la cantidad de limosinas del hotel.
 *
 * En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a
 * los de los hoteles, estando más orientados a la vida al aire libre y al
 * turista de bajos recursos. Por cada Alojamiento Extrahotelero se indica si es
 * privado o no, así como la cantidad de metros cuadrados que ocupa. Existen dos
 * tipos de alojamientos extrahoteleros: los Camping y las Residencias. Para los
 * Camping se indica la capacidad máxima de carpas, la cantidad de baños
 * disponibles y si posee o no un restaurante dentro de las instalaciones. Para
 * las residencias se indica la cantidad de habitaciones, si se hacen o no
 * descuentos a los gremios y si posee o no campo deportivo. Realizar un
 * programa en el que se representen todas las relaciones descriptas. Realizar
 * un sistema de consulta que le permite al usuario consultar por diferentes
 * criterios: • todos los alojamientos. • todos los hoteles de más caro a más
 * barato. • todos los campings con restaurante • todos las residencias que
 * tienen descuento.
 *
 * @author peras
 */
public class Herencia03Extra {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<Hotel> listaHoteles = new ArrayList<>();
        Estrellas5 hotel1 = new Estrellas5(EnumGimnasio.A, "Cucho´s Dinner", 100, 2, 7, 10, 20, 50, 11, "Cucholandia", "av1 100", "gatopolis", "Plomo");
        Estrellas5 hotel2 = new Estrellas5(EnumGimnasio.B, "Cucho´s Dinner", 100, 2, 7, 10, 20, 50, 11, "Cucholandia", "av1 100", "gatopolis", "Plomo");
        Estrellas5 hotel3 = new Estrellas5(EnumGimnasio.B, "Cucho´s Dinner", 100, 2, 7, 10, 20, 50, 11, "Cucholandia", "av1 100", "gatopolis", "Plomo");
        Estrellas4 hotel4 = new Estrellas4(EnumGimnasio.A, "Plomo´s Dinner", 50, 35, 27, 5, "Plomolandia", "av2 100", "Felinopolis", "Cucho");
        Estrellas4 hotel5 = new Estrellas4(EnumGimnasio.B, "Plomo´s Dinner", 50, 35, 27, 5, "Plomolandia", "av2 100", "Felinopolis", "Cucho");
        Estrellas4 hotel6 = new Estrellas4(EnumGimnasio.A, "Plomo´s Dinner", 50, 35, 27, 5, "Plomolandia", "av2 100", "Felinopolis", "Cucho");
        hotel1.calcularPrecio();
        hotel2.calcularPrecio();
        hotel3.calcularPrecio();
        hotel4.calcularPrecio();
        hotel5.calcularPrecio();
        hotel6.calcularPrecio();
        listaHoteles.add(hotel1);
        listaHoteles.add(hotel2);
        listaHoteles.add(hotel3);
        listaHoteles.add(hotel4);
        listaHoteles.add(hotel5);
        listaHoteles.add(hotel6);

        //        System.out.println(hotel1.toString());
        //        System.out.println(hotel2.toString());
        //        System.out.println(hotel3.toString());
        //        System.out.println(hotel4.toString());

        Camping camp1 = new Camping(7, 2, true, true, 0, "", "", "", "");
        Camping camp2 = new Camping(5, 3, false, false, 300, "", "", "", "");
        Residencia res1 = new Residencia(0, true, true, true, 0, "", "", "", "");
        Residencia res2 = new Residencia(0, false, false, true, 0, "", "", "", "");

    }
}

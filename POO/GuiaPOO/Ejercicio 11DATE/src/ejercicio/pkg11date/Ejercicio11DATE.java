package ejercicio.pkg11date;

// 11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
//package ejercicio.pkg11date;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Ejercicio11DATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Date fechaActual = new Date();

        
        System.out.println("Ingrese el dia:");
        int dia = scan.nextInt();
        System.out.println("Ingrese mes:");
        int mes = scan.nextInt();
        System.out.println("Ingrese año:");
        int anio = scan.nextInt();
        
        Date fecha1=new Date(anio,mes,dia);
        System.out.println("date actual "+fechaActual.getYear());
        System.out.println("Diferencia de año:"+ (fechaActual.getYear()+1900-fecha1.getYear()));
    }
    
}

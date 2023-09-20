/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import exepciones.errorPersonalizado;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Juego {

    private Integer numeroRandom;

    public Juego() {
        aleatorio();
    }

    public Juego(Integer numeroRandom) throws errorPersonalizado{
        try {
            if (numeroRandom < 0) {
                throw new errorPersonalizado( "El numero es menor a 0");
            }
            
            
        }
         catch (errorPersonalizado e) {
             throw e;
        }
        catch (Exception e) {
          
//            System.out.println("Error desconocido");
           
        }
        this.numeroRandom = numeroRandom;
    }

//    public int getNumeroRandom() {
//        return numeroRandom;
//    }
//
//    public void setNumeroRandom(int numeroRandom) {
//        this.numeroRandom = numeroRandom;
//    }

    @Override
    public String toString() {
        return "Juego{" + "numeroRandom=" + numeroRandom + '}';
    }

    public void aleatorio() {
        this.numeroRandom = (int) (Math.random() * 500);
    }

//    Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
//debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
//ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
//número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
//consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
//ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
//controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
//carácter fallido como un intento.
    public void jugar() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int intentos = 0;
        int numeroIngresado = -1;

        do {
            System.out.println("Adivine el numero:");
            intentos++;
            try {
                numeroIngresado = scan.nextInt();

                if (numeroIngresado > this.numeroRandom) {
                    System.out.println("Te pasaste");
                } else if (numeroIngresado < this.numeroRandom) {
                    System.out.println("Te falto");
                } else {
                    System.out.println("Adivinaste, \n Fueron " + intentos + " intentos");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresaste una letra invesil.");
                scan.next();
            }

        } while (this.numeroRandom != numeroIngresado);
    }
}

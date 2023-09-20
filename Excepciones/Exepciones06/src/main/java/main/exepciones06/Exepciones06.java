/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.exepciones06;

/**
 *
 * @author peras
 */
public class Exepciones06 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            System.out.println(metodo2());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo2() ");
            e.printStackTrace();
        }

    }

    private static int metodo2() {
        int valor = 0;
        try {
            valor = valor + 1;//1
            valor = valor + Integer.parseInt("W");//error
            valor = valor + 1;//error
            System.out.println("Valor final del try : " + valor);//error
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("w");//43
            System.out.println("Valor final del catch  : " + valor);//43
        } finally {
            valor = valor + 1;//44
            System.out.println("Valor final del finally: " + valor);//44
        }
        valor = valor + 1;//45
        System.out.println("Valor antes del return: " + valor);//45
        return valor;
    }
    //public static void main (String[] args) {
    //try{
    //System.out.println ( metodo ( ) ) ;
    //} catch(Exception e) {
    //System.err.println ( ” Excepcion en metodo ( ) ” ) ;
    //e.printStackTrace();
    //}
    //
    // }

    public static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("42a");
            valor = valor + 1;
            System.out.println("Valor final del try : " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch  : " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor
        );
        return valor;
    }
}

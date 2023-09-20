/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Biblioteca.Libro;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments000
     */
    public static void main(String[] args) {
        Scanner scanPalabra = new Scanner(System.in);
        Scanner scanNumero = new Scanner(System.in);
        Libro primerLibro = new Libro(0000001,"Primer libro","santy",100);
 
         
        
        System.out.println("Ingrese codigo de barras: ");
        int isbn = scanNumero.nextInt();
        
        System.out.println("Ingrese Titulo: ");
        String titulo = scanPalabra.nextLine();
        System.out.println("Ingrese autor: ");
        String autor = scanPalabra.nextLine();
        System.out.println("Cantidad de paginas: ");
        int paginas = scanNumero.nextInt();
        Libro segundoLibro = new Libro(isbn,titulo,autor,paginas);
  
        
        System.out.println(primerLibro);
        System.out.println("");
        System.out.println(segundoLibro);
        
    }
    
}

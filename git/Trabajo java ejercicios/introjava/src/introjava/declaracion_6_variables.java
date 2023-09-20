/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class declaracion_6_variables {
    public static void main(String[] args) {
        int numero1;
        short numero2;
        byte numero3;
        String nombre1;
        boolean logico;
        double numero4;
        float numero5;
        char simbolo;
        
        numero1=20;
        numero2=30;
        numero3= 50;
        nombre1="santi";
        logico=true;
        numero4=20.5;
        numero5=(float) 12.5;
        simbolo ='e';
        
        System.out.println("(Santi)");//escribir o escribir sin saltar
        Scanner sc = new Scanner(System.in);//leer
        System.out.println("Decime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Decime tu nombre: " + nombre);
        
 // Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
 // alguno de ellos es mayor a 25.
 
//   //declaro variables enteras
 int num1;
 int num2;
  
  //declaro el scanner
  Scanner scan1 = new Scanner(System.in);
 
  //pido los datos al usuario
  System.out.println("ingrese un numero");
  num1 = scan1.nextInt();
  System.out.println("ingrese otro numero");
  num2 = scan1.nextInt();
  
  // if == al SI
  if (num1 >25 && num2>25) {
  System.out.println("ambos son mayores a 25");
  } else if (num1 >25 || num2>25) { // es igual al sino si
   System.out.println("uno de los dos numeros es mayor a 25");
  } else  { // es igual al sino
   System.out.println("ninguno de los dos es mayor a 25");
  }
 
 }
    
    
        
    }
 
  
    

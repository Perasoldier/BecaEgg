/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Ahoracado {
    private String[] listado;
    private String[] usadas;
    private int cantEncontradas=0;
    private int cantMaxJugadas;
    private int contador=0;

    public Ahoracado() {
    }

    public Ahoracado(int cantEncontradas, int cantMaxJugadas) {
        this.cantEncontradas = cantEncontradas;
        this.cantMaxJugadas = cantMaxJugadas;
    }

    public String[] getListado() {
        return listado;
    }

    public void setListado(String[] listado) {
        this.listado = listado;
    }

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public int getCantMaxJugadas() {
        return cantMaxJugadas;
    }

    public void setCantMaxJugadas(int cantMaxJugadas) {
        this.cantMaxJugadas = cantMaxJugadas;
    }

    Scanner scan = new Scanner(System.in);

    public String crearJuego() {
        System.out.println("Ingrese palabra a adivinar: ");
        String palabra = scan.nextLine();
        this.listado = new String[palabra.length()];
        this.usadas = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) { //llenado vector.
            listado[i] = palabra.substring(i, i + 1);
        }
        for (int i = 0; i < palabra.length(); i++) { //impresion de vector.
            System.out.print(listado[i]);
        }
        System.out.println("");
        
        System.out.println("Ingrese chances maximas:");
        this.cantMaxJugadas = scan.nextInt();
        this.cantEncontradas = 0;
       return palabra;
    }

    public int longitud(){
        System.out.println("Longitud de palabra a adivinar: ");
        System.out.println(this.listado.length);
        return this.listado.length;
    }

    public boolean buscar(String letra) {
        int cantidad = 0;
        boolean gano = false;
        for (int i = 0; i < listado.length; i++) {
            if (letra.equalsIgnoreCase(listado[i])) {
                System.out.println("Se encontro en la posicion: " + (i+1));
                cantidad++;
            }

        }
        System.out.println("Se encontro la letra " + cantidad + " veces");
        this.cantEncontradas = this.cantEncontradas+cantidad;
        System.out.println("lleva encontradas "+ this.cantEncontradas+ " de "+ this.listado.length+"letras totales");
        if (this.cantEncontradas==this.listado.length) {
            gano=true;
        }
        return gano;
    }
//    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.

    public boolean encontradas(String letra) {
        boolean seEncontro = false;
        
        for (int i = 0; i < listado.length; i++) {
            if (letra.equalsIgnoreCase(listado[i])) {
//                System.out.println("se encontro en la posicion: " + (i + 1));
                seEncontro = true;
            }
        }
        if (seEncontro) {
            return true;
        } else {
            return false;

        }
    }
    
    public void intentos(){
        System.out.println("Te quedan "+ this.cantMaxJugadas +" intentos");
    }
    
//    
//    Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    public void juego(String palabra){
        Scanner scanj = new Scanner(System.in);
        
        System.out.println("Comienza el juego:");
        System.out.println("Usted tiene "+this.cantMaxJugadas+" jugadas disponibles");
        
        do {
            System.out.println("Ingrese letra a Encontrar:");
            String letra = scanj.nextLine();                        
            
            
//            almacenadas(letra,palabra);           
//            buscar(letra);            
//            almacenadas(letra,palabra);
            
            if (encontradas(letra)) {
                if (almacenadas(letra, palabra)) {
                if (buscar(letra)) {
                  System.out.println("Usted gano");
                break;  
            } else {
                cantMaxJugadas--;
                System.out.println("No se encontro la letra.");
                
                
            }
            System.out.println("Le quedan "+this.cantMaxJugadas+" intentos");
            
            
            
            
                }
            } 
        }   while (this.cantMaxJugadas!=0);
    
    }

    public boolean almacenadas(String letra, String palabra) {

        boolean seEncontro = false;
//         this.usadas[this.contador] = letra;
//        System.out.println("se almaceno la letra " + letra + " en la posicion " + this.contador);
        for (int i = 0; i < palabra.length(); i++) {
            if (letra.equalsIgnoreCase(usadas[i])) {
                System.out.println("La letra ingresada esta repetida");
                seEncontro = true;
                this.cantMaxJugadas--;
            }

        }
         if (!seEncontro) {
             System.out.println("letra valida");
             System.out.println("se almaceno la letra " + letra + " en la posicion " + this.contador);
             this.usadas[this.contador] = letra;
         }
        this.contador++;
         System.out.println("contador en "+this.contador);
         
         
         return seEncontro;
     }
    }
    
    
    


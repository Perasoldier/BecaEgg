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
public class NIF {
    private int dni;
    private Character letra;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }
    Scanner scan= new Scanner(System.in);
    
//    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.
    
    public void crearNif(Character[] listado){
        System.out.println("Ingrese numero DNI: ");
        this.dni= scan.nextInt();
        int numero = dni % 23;
        System.out.println(numero);
        for (int i = 0; i <23; i++) {
            if (numero==i) {
                this.letra=listado[i];
            }
        }
        
    }
    
    public void mostrar(){
        System.out.println(this.dni+"-"+this.letra);        
    }
}
//    public void mostrar() {
//        System.out.println(String.format("%08d", numeroDNI) + "-" + letra);
//    }
//}

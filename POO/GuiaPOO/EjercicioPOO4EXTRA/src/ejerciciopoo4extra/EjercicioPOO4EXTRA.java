/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo4extra;

import Entity.NIF;

/**
 *
 * @author peras
 */
public class EjercicioPOO4EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF persona1 = new NIF();
        Character[]listado = new Character[23];
        listado[0]= 'T';
        listado[1]= 'R';
        listado[2]= 'W';
        listado[3]= 'A';
        listado[4]= 'G';
        listado[5]= 'M';
        listado[6]= 'Y';
        listado[7]= 'F';
        listado[8]= 'P';
        listado[9]= 'D';
        listado[10]= 'X';
        listado[11]= 'B';
        listado[12]= 'N';
        listado[13]= 'J';
        listado[14]= 'Z';
        listado[15]= 'S';
        listado[16]= 'Q';
        listado[17]= 'V';
        listado[18]= 'H';
        listado[19]= 'L';
        listado[20]= 'C';
        listado[21]= 'K';
        listado[22]= 'E';
        
        for (int i = 0; i < 23; i++) {
            
            System.out.println(i+" "+ listado[i]);
        }
        
        persona1.crearNif(listado);
        persona1.mostrar();
        
        
    }
    
}

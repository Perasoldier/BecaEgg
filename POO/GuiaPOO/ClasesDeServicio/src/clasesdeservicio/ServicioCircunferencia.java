/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesdeservicio;

import Entity.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author peras
 */
public class ServicioCircunferencia {
    Scanner scan = new Scanner(System.in);
     
    public Circunferencia crearCincurferencia(){
        Circunferencia segunda = new Circunferencia();
        System.out.println("Ingrese Radio:");
        segunda.setRadio(scan.nextDouble());

        return segunda;

//        double radio = scan.nextDouble();
//        Circunferencia primera = new Circunferencia(radio);        
//        return primera;


//        return new Circunferencia(scan.nextDouble()) ;
        
        
    }
    
    public double calcularArea(Circunferencia A){
       
        return PI*Math.pow(A.getRadio(), 2); 
    }
    
    
    public double calcularPerimetro(Circunferencia A){
        
        return 2*PI*A.getRadio() ;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;

/**
 *Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre
 * @author peras
 */
public class Televisor extends Electrodomestico {
    private int pulgadas;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sintonizador) {
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Televisor(int pulgadas, boolean sintonizador, Double precio, Double peso, String color, char consumo) {
        super(precio, peso, color, consumo);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo+ ", pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + '}';
    }
    
    
    
//    Los métodos que se implementara serán:
//• Método get y set de los atributos resolución y sintonizador TDT.
//• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
//Finalmente, en el main debemos realizar lo siguiente:
//Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
//el precio final de los dos electrodomésticos. 

    
     public void crearTelevisor(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese Pulgadas");
        this.pulgadas = scan.nextInt();
         System.out.println("Ingrese sintonizador : Si o No?");
        
         if (scan.next().toLowerCase().charAt(0)=='s') {
             this.sintonizador= true;
         }else{
         this.sintonizador = false;
         }
         precioFinalTelevisor();
         
         toString();
    }
 
     public void precioFinalTelevisor(){
         preciofinal();
         if (pulgadas>=40) {
             this.precio = (this.precio*1.3);
         }
         if (sintonizador) {
             this.precio = this.precio+500.0;
         }
         
         
     }
    
   
}

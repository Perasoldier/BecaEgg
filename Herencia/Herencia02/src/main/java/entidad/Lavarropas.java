/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;

/**
 * A continuación, se debe crear una subclase llamada Lavadora, con el atributo
 * carga, además de los atributos heredados. Los constructores que se
 * implementarán serán: • Un constructor vacío. • Un constructor con la carga y
 * el resto de los atributos heredados. Recuerda que debes llamar al constructor
 * de la clase padre.
 *
 * @author peras
 */
public class Lavarropas extends Electrodomestico {

    private Double carga;

    public Lavarropas() {
    }

    public Lavarropas(Double carga) {
        this.carga = carga;
    }

    public Lavarropas(Double carga, Double precio, Double peso, String color, char consumo) {
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
      public String toString() {
        return "Lavarropas{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + ", carga=" + carga + '}';
      }



 
    
//Los métodos que se implementara serán:

//• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
//• Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio
    
    public void crearLavarropa(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese carga");
        this.carga = scan.nextDouble();
        precioFinalLavarropas();
    }
    
//    @Override //coe del cargo
//    public void preciofinal(){
//        if (this.carga>30) {
//            this.precio = this.precio + 500.0;
//            
//        }
//        System.out.println("precio final override " + this.precio);
//    
//    }
    
    
    public void precioFinalLavarropas(){
        preciofinal();
        
        if (this.carga>30) {
            this.precio = this.precio + 500.0;
            
        }
//        System.out.println("precio final " + this.precio);
    }
}

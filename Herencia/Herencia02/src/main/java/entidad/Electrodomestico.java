/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author peras
 */
public class Electrodomestico {

    protected Double precio, peso;
    protected String color;
    protected char consumo;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, Double peso, String color, char consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }


    public String toStringPadre() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + '}';
    }

//    
//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    public char comprobarCosumoEnergetico(char consumo) {
        if (consumo == 'a' || consumo == 'b' || consumo == 'c' || consumo == 'd' || consumo == 'e' || consumo == 'f') {
            return consumo;
        } else {
            return 'f';
        }

    }

//    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "BLANCO";
        }
    }

//    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public void crearElectrodomestico() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        this.precio = 1000.0;
        System.out.println("Indique peso:");
        this.peso = scan.nextDouble();
        System.out.println("Indique color");
        String color = scan.next();
        this.color = comprobarColor(color);
        System.out.println("indique consumo");
        char consumo = scan.next().charAt(0);     
        this.consumo = comprobarCosumoEnergetico(consumo);
        System.out.println(consumo);
        
    }

//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    public void preciofinal() {
        
//        System.out.println(this.consumo);
        switch (this.consumo) {
            case 'a':
//                System.out.println("entro a");
                this.precio = this.precio + 1000;
//                System.out.println(this.precio);
                break;
            case 'b':
                this.precio = this.precio + 800.0;
                break;
            case 'c':
                this.precio = this.precio + 600.0;
                break;
            case 'd':
                this.precio = this.precio + 500.0;
                break;
            case 'e':
                this.precio = this.precio + 300.0;
                break;
            case 'f':
                this.precio = this.precio + 100.0;
                break;

            default:
                System.out.println("no se encontro caracter..");
                break;

        }

        if (this.peso >= 1 && this.peso < 20) {
            this.precio = this.precio + 100;
        } else if (this.peso >= 20 && this.peso < 50) {
            this.precio = this.precio + 500;

        } else if (this.peso >= 50 && this.peso < 80) {
            this.precio = this.precio + 800;

        } else if (this.peso >= 80) {
            this.precio = this.precio + 1000;

        }else {
            System.out.println("no se encontro peso");
        }
    }
    
    
  

}

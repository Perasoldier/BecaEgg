/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import interfaces.Modulo;
import java.util.Scanner;

/**
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
 * Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler,
 * fecha de devolución, la posición del amarre y el barco que lo ocupará. Un
 * Barco se caracteriza por: su matrícula, su eslora en metros y año de
 * fabricación. Sin embargo, se pretende diferenciar la información de algunos
 * tipos de barcos especiales: • Número de mástiles para veleros. • Potencia en
 * CV para barcos a motor. • Potencia en CV y número de camarotes para yates de
 * lujo
 *
 * @author peras
 */
public class Lancha extends Barco implements Modulo {

    private int potencia;

    public Lancha() {
    }

    public Lancha(int potencia) {
        this.potencia = potencia;
    }

    public Lancha(int potencia, int matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.potencia;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lancha other = (Lancha) obj;
        return this.potencia == other.potencia;
    }

    @Override
    public String toString() {
        return "Lancha{" + "potencia=" + potencia + '}';
    }

    @Override
    public int modulo() {
//        System.out.println(super.getEslora()*10+this.potencia);
        return super.getEslora() * 10 + this.potencia;
    }

    @Override
    public void crearBarco() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la matricula del barco");
        super.setMatricula(scan.nextInt());
        System.out.println("Ingrese la eslora del barco");
        super.setEslora(scan.nextInt());
        System.out.println("Ingrese el año de fabricacion del barco");
        super.setAnio(scan.nextInt());
        System.out.println("Ingrese potencia");
        this.potencia = scan.nextInt();
    }

}
